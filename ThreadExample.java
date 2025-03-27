class NumberPrinter implements Runnable { 
    private int start, end; 
 
    public NumberPrinter(int start, int end) { 
        this.start = start; 
        this.end = end; 
    } 
 
    @Override 
    public void run() { 
        for (int i = start; i <= end; i++) { 
            System.out.println(Thread.currentThread().getName() + ": " + i); 
        } 
    } 
} 
 
public class ThreadExample { 
    public static void main(String[] args) { 
     
        Thread thread1 = new Thread(new NumberPrinter(1, 10), "Thread1"); 
        Thread thread2 = new Thread(new NumberPrinter(90, 100), "Thread2"); 
 
   
        thread1.start(); 
        thread2.start(); 
    } 
} 
