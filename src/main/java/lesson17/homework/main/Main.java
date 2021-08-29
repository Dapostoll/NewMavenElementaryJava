package lesson17.homework.main;

import lesson17.homework.deadlock.Kek;
import lesson17.homework.deadlock.Lol;
import lesson17.homework.thread.FirstMultithreadingClassThread;
import lesson17.homework.thread.SecondMultithreadingClassRunnable;
import lesson17.homework.thread.TheThirdMultithreadingClassCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main thread started.");

        FirstMultithreadingClassThread firstMultithreadingClassThread = new FirstMultithreadingClassThread("FirstMultithreadingClassThread");
        firstMultithreadingClassThread.start();
        firstMultithreadingClassThread.getName();

        SecondMultithreadingClassRunnable secondMultithreadingClassRunnable = new SecondMultithreadingClassRunnable();
        Thread thread2 = new Thread(secondMultithreadingClassRunnable);
        thread2.start();

        thread2.setName("SecondMultithreadingClassRunnable");

        TheThirdMultithreadingClassCallable theThirdMultithreadingClassCallable = new TheThirdMultithreadingClassCallable();
        FutureTask<String> futureTask = new FutureTask<>(theThirdMultithreadingClassCallable);
        Thread thread3 = new Thread(futureTask);
        thread3.start();

        thread3.setName("TheThirdMultithreadingClassCallable");
        System.out.println(futureTask.get());

        Thread.sleep(5000);
        System.out.println("Main thread finished.");

        System.out.println("5.1  2828 - 3000");
        System.out.println("5.2  3000 - 3000");
        System.out.println("5.3  method FirstMultithreadingClassThread 1-1000, SecondMultithreadingClassRunnable 1001-2000, TheThirdMultithreadingClassCallable 2001-3000");


        deadlockProcedure();
    }

    private static void deadlockProcedure() {

        Kek kek = new Kek();
        Lol lol = new Lol();

        kek.setLol(lol);
        lol.setKek(kek);

        Thread thread1 = new Thread(() -> System.out.println(kek.getLolMessage()));
        Thread thread2 = new Thread(() -> System.out.println(lol.getKekMessage()));

        thread1.start();
        thread2.start();
    }
}
