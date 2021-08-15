package java8.homework.gachiinterface;

public interface DungeonMaster {

    default String gachimuchi() {
        return "Do You Like What You See";
    }

    static void dungeonMaster() {
        System.out.println("DUNGEON MASTER");
    }

    String doYouLikeWhatYouSee();

    String youDungeonMaster();
}
