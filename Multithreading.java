package multithreading;
public class Multithreading extends Thread{
    Multithreading(String name)
    {
        System.out.println(name);
    }
    @Override
    public void run()
    {
        try{
            System.out.println("Thread " +Thread.currentThread().getId() +" is running");    
        }
        catch(Exception ex)
        {
            System.out.println(" Exception Caught");
        }
    try
    {
        Thread.sleep(1000);
        System.out.println("Thread "+Thread.currentThread().getId()+ " is Sleeping");
    }
    catch(InterruptedException ie)
    {
        System.out.println("Exception Caught: " + ie);
    }
    }
   
    public static void main(String[] args) {
        Multithreading t1 = new Multithreading("Thread 1 Object");
        Multithreading t2 = new Multithreading("Thread 2 Object");
        t1.start();
        t1.getName();
        try
        {
            Multithreading.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Exception Occured");
        }
    t2.start();
    System.out.println("Irfan Here... just text to see threads seperately");
    }   
}