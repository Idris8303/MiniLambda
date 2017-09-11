
public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": Anonymous run");

        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        };
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
        anonRun.run();

        Runnable lambdaRun = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };
        Thread thread1 = new Thread(anonRun);

        thread1.start();
        thread2.start();

        new Thread(lambdaRun).start();


        lambdaRun.run();

    }
}











