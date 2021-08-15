package java8.homework.gachiinterface;

public interface CollegeBoy {

    default String gachimuchi() {
        return "Deep Dark Fantasies";
    }

    static void collegeBoy() {
        System.out.println("COLLEGE BOY");
    }

    String deepDarkFantasies();

    String youCollegeBoy();
}
