class thread1 extends Thread
{
   thread1()
   {
     start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<5;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("Thread interrupted");
     }
     System.out.println("Thread finished" );
   }
}
class ForMainThread
{
   public static void main(String args[])
   {	
      thread1 ob1 = new thread1();
      try
      {
         while(ob1.isAlive())
         {
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(1500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread finished" );
   }
}
