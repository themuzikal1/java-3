package concurrency;

public abstract class Main  {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
        concurrency.Reasoning thread = new concurrency.Reasoning();
        thread.start();
        System.out.println("This is the Reasoning thread.");
        concurrency.Reasoning.distinguish();

        concurrency.TeamTC1 thread2 = new concurrency.TeamTC1("Team Mark");
        thread2.run();




    }



}
