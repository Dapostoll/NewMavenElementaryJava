package java8.homework.gachiinterface;

public interface BossOfThisGym {

    default String gachimuchi() {
        return "Next Door";
    }

    static void bossOfThisGym() {
        System.out.println("BOSS OF THIS GYM");
    }

    String youBossOfThisGym();

    String nextDoor();
}
