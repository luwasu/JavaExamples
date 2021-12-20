package threadAndMultithreading.multithreading;

public class MyCustomRunnableClass implements Runnable {

    @Override
    public void run() {

        for(int i =0;i<10;i++) {
            System.out.println(getClass().getSimpleName() + " - Thread #2 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished :)");
    }
}
