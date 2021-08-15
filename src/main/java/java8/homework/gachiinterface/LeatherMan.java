package java8.homework.gachiinterface;

public interface LeatherMan {

    default String gachimuchi() {
        return "Knock Out";
    }

    static void leatherMan() {
        System.out.println("LEATHER MAN");
    }

    String knockOut();

    String youLeatherMan();
}
