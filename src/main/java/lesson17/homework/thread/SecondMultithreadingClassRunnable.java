package lesson17.homework.thread;

import lesson17.homework.thread.helper.Helper;

public class SecondMultithreadingClassRunnable implements Runnable {
    @Override
    public void run() {
        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
    }
}
