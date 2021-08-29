package lesson17.homework.thread;

import lesson17.homework.thread.helper.Helper;

public class FirstMultithreadingClassThread extends Thread{

    public FirstMultithreadingClassThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Helper.readThreadNameAndIncrVar();
        }
    }
}
