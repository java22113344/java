import java.util.Random; 
 
class SharedData { 
    private int number; 
    private boolean evenReady = false, oddReady = false; 
 
    public synchronized void setNumber(int number) { 
        this.number = number; 
      
 
   if (number % 2 == 0) { 
            evenReady = true; 
 
            oddReady = false; 
            notifyAll(); // Notify the square calculator 
        } else { 
            oddReady = true; 
            evenReady = false; 
            notifyAll(); // Notify the cube calculator 
        } 
    } 
 
    public synchronized int getNumber() { 
        return number; 
    } 
 
    public synchronized void waitForEven() { 
        while (!evenReady) { 
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                Thread.currentThread().interrupt(); 
            } 
        } 
        evenReady = false; 
    } 
    public synchronized void waitForOdd() { 
        while (!oddReady) { 
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                Thread.currentThread().interrupt(); 
            } 
        } 
        oddReady = false; 
    } 
} 
class RandomNumberGenerator extends Thread { 
    private final SharedData sharedData; 
 
    public RandomNumberGenerator(SharedData sharedData) { 
        this.sharedData = sharedData; 
    } 
 
    public void run() { 
        Random random = new Random(); 
        while (true) { 
            int num = random.nextInt(100); // Generate random number between 0 and 99 
            System.out.println("Generated: " + num); 
            sharedData.setNumber(num); 
            try { 
                Thread.sleep(1000); // Sleep for 1 second 
            } catch (InterruptedException e) { 
                Thread.currentThread().interrupt(); 
            } 
 
 
        } 
    } 
} 
 
class SquareCalculator implements Runnable { 
    private final SharedData sharedData; 
 
    public SquareCalculator(SharedData sharedData) { 
        this.sharedData = sharedData; 
    } 
 
    public void run() { 
        while (true) { 
            sharedData.waitForEven(); 
            int num = sharedData.getNumber(); 
            System.out.println("Square: " + (num * num)); 
        } 
    } 
} 
 
class CubeCalculator implements Runnable { 
    private final SharedData sharedData; 
 
    public CubeCalculator(SharedData sharedData) { 
        this.sharedData = sharedData; 
    } 
 
    public void run() { 
        while (true) { 
            sharedData.waitForOdd(); 
            int num = sharedData.getNumber(); 
            System.out.println("Cube: " + (num * num * num)); 
        } 
    } 
} 
 
public class MultiThreadApplication { 
    public static void main(String[] args) { 
        SharedData sharedData = new SharedData(); 
 
        RandomNumberGenerator generator = new     
	RandomNumberGenerator(sharedData); 
        Thread squareThread = new Thread(new SquareCalculator(sharedData)); 
        Thread cubeThread = new Thread(new CubeCalculator(sharedData)); 
 
        generator.start(); 
        squareThread.start(); 
        cubeThread.start(); 
    } 
}