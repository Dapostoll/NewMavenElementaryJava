package java8.homework.gachiclass;

import java8.homework.gachiinterface.DungeonMaster;
import java8.homework.gachiinterface.LeatherMan;

public class SecondGachiClass implements DungeonMaster, LeatherMan {
    @Override
    public String gachimuchi() {
        return "Do You Like What You See, Knock Out";
    }

    @Override
    public String doYouLikeWhatYouSee() {
        return "Do You Like What You See???";
    }

    @Override
    public String youDungeonMaster() {
        return "Are You Dungeon Master?";
    }

    @Override
    public String knockOut() {
        return "Knock Out!";
    }

    @Override
    public String youLeatherMan() {
        return "Are You Leather Man?";
    }
}
