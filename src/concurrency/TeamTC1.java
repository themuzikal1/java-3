package concurrency;

import java.util.ArrayList;

public class TeamTC1 implements Runnable {

   private Thread t;
   private String threadName;

   TeamTC1(String name) {
       threadName = name;
       System.out.println("Creating " + threadName);
   }

    public static void main(String[] args) {



        }

        public void run () {
            ArrayList<String> team = new ArrayList<String>();
            team.add("Mark Bennett");
            team.add("Aaron White");
            team.add("Kevin Keesee");
            team.add("Korey Brooks");
            team.add("Caleb Waters");
            team.add("Cody Clark");
            team.add("Gotham Katta");
            team.add("John Bozarov");
            team.add("Justin Cheng");
            team.add("Matthew Choat");
            team.add("Sarah Bates");
            team.add("Tyler Clements");
            team.add("Zach Johnson");

            System.out.println("Running " + threadName);
            try {
                for (int i = 0; i < team.size(); i++) {
                    System.out.println(team.get(i));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }
            System.out.println(team);
            System.out.println("Thread " + threadName + " exiting.");

        }

}



//This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.
// In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).
// There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List
// After all the names have been pushed to this List, print out the entire list of all the students in your TA group.
// Don't forget your TA as well!  All of these steps should be done whenever the thread is started.
// (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package.