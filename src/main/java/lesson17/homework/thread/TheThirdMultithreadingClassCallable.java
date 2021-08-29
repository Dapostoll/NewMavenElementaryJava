package lesson17.homework.thread;

import lesson17.homework.thread.helper.Helper;

import java.util.concurrent.Callable;

public class TheThirdMultithreadingClassCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
        return "FINISHED";
    }
}
