package threadAndMultithreading.multithreading;


/*
     Multithreading = Process if executing multiple threads simultaneously
                      Helps maximise utilization of CPU
                      Threads are independent, they do not affect the execution of other threads.
                      An exception is one thread will not interrupt other threads
                      useful for serving multiple clients, multiplayer games, or other mutually independent tasks

                      There are two ways to create a thread:
                            - by extending the Thread class
                            - or by implementing the Runnable interface
                                - This can be useful when you want to extend (inherit) another class and still do multithreading.


               Useful information on  Threads: - interrupt(); -> is used to stop a thread (do not use stop();)

                                               - notify(), notifyAll(); & wait(); -> can be used to synchronise methods that need
                                                 to wait for another thread that will notify the waiting thread with notify.

                                               - synchronised: Synchronization in java is the capability to
                                                 control the access of multiple threads to any shared resource

*/

public class MultithreadingExampleClass {

    public static void main(String[] args) throws InterruptedException {

        // Create a subclass of Thread
        MyCustomThreadClass thread1 = new MyCustomThreadClass();

        //or

        //implement Runnable interface and pass instance as an argument to Thread()
        MyCustomRunnableClass runnable1 = new MyCustomRunnableClass();
        Thread thread2 = new Thread(runnable1);


//        thread1.setDaemon(true);   // Uncomment to see use
//        thread2.setDaemon(true);   //1. The Deamon Threads will be canceled as soon as the non-deamon threads as completed.

        thread1.start();
        thread1.join(3000); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds

        thread1.interrupt();     // Interrupt is used to stop a thread. It will throw a g.InterruptedException Do not use stop()!!!!

        thread2.start();

//         System.out.println(1/0);   // Uncomment to see use
//                                    // 2. Threads will still run even when one of the threads throws an exception
    }
}

