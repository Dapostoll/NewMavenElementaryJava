package java8.homework.gachiclass;

import java8.homework.gachiinterface.BossOfThisGym;
import java8.homework.gachiinterface.CollegeBoy;

public class FirstGachiClass implements BossOfThisGym, CollegeBoy {

    @Override
    public String gachimuchi() {
        return "Next Door, Deep Dark Fantasies";
    }

    @Override
    public String youBossOfThisGym() {
        return "Are You Really Boss Of This Gym???";
    }

    @Override
    public String nextDoor() {
        return "BOY, Next Door!";
    }

    @Override
    public String deepDarkFantasies() {
        return "Deep Dark Fantasies!";
    }

    @Override
    public String youCollegeBoy() {
        return "Are You Really College Boy???";
    }
}
