package concurrency;




public class Reasoning extends Thread {
    //set up this class so it can become a valid thread.

    public static void distinguish() {
        System.out.println("A process is any program in execution.\n ");
        System.out.println("A thread is the segment of a process.  A process can have multiple threads and these threads are contained in a process.");
        System.out.println("Invoking the run method will throw an exception.");
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
    }

}

