package lesson17.homework.thread.helper;

public class Helper {
    public static int COUNT = 1;

    public static synchronized int readThreadNameAndIncrVar() {
        String name = Thread.currentThread().getName();

        System.out.print(name + COUNT + " ");
        return COUNT++;
    }
}
