package threadAndMultithreading.threads;


    	/*
    	 Source: https://www.youtube.com/watch?v=a_LBuCx1KTE&ab_channel=BroCode


    	    Thread =	A thread of execution in a program (kind of like a virtual CPU)
    	      			The JVM allows an application to have multiple threads running concurrently
    	    			Each thread can execute parts of you code in parallel with the main thread
    	    			Each thread has a priority.

    	    			Threads with higher priority are executed in preference compared to threads with a lower priority

    	    		    The Java Virtual Machine continues to execute threads until either of the following occurs
    	      				1. The exit method of class Runtime has been called
    	    				2. All user threads have died

    	    			When a JVM starts up, there is a thread which calls the main method
    	    			This thread is called “main”

    		    		Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.
			    	    The JVM terminates itself when all user threads (non-daemon threads) finish their execution.
    	 */

public class ThreadExampleClass {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("***********************Main Thread Example***************************");

        System.out.println("Is the main thread active: " + Thread.activeCount());                 // Counts how many threads are running.

        Thread.currentThread().setName("MAIN");                   // set a name for the thread otherwise it will take a default "main".
        System.out.println("The name of the main thread is: " + Thread.currentThread().getName());     // Gets the name of the thread.

        Thread.currentThread().setPriority(10);                   // set the priority of the thread between 1 == low and 10 == high.
        System.out.println("The priority of the main thread is: " + Thread.currentThread().getPriority()); // print the priority of the thread.

        System.out.println("Is the current thread alive? " + Thread.currentThread().isAlive());     // check if the thread is alive


        System.out.println("**********************Thread.sleep() Example*******************");
        // Countdown to 0 with a short break/sleep in-between
        System.out.println("Countdown from 5 with one second thread sleep.");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // sleep for one second
        }
        System.out.println("You are done!");


        System.out.println("***********************Custom and Deamon Thread Example***************************");


        // Create a Thread with the MyThread class
        MyThread myCustomThread = new MyThread();


        // Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.
        // The JVM terminates itself when all user threads (non-daemon threads) finish their execution.
        myCustomThread.setDaemon(true);
        System.out.println("Is this thread a deamon thread? " + myCustomThread.isDaemon());

        myCustomThread.start();                           // the start() method starts the run() method from our MyThread.class

        System.out.println("Is the Thread alive? " + myCustomThread.isAlive());    // check if the thread is alive

        myCustomThread.setName("Custom Thread");            // set a name for the thread.
        System.out.println("The name of the thread is: " + myCustomThread.getName());    // Gets the name of the thread.

        myCustomThread.setPriority(1);                      // set the priority of the thread between 1 == low and 10 == high.
        System.out.println("The priority of the thread is: " + myCustomThread.getPriority());   // print the priority of the thread.

        System.out.println("How many threads are active? " + Thread.activeCount());         // Counts how many threads are running.
    }
}

