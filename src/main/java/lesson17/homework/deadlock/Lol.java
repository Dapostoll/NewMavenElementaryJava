package lesson17.homework.deadlock;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Lol {

    private Kek kek;

    public synchronized String getMessage(){
        return "lol";
    }

    public synchronized String getKekMessage() {
        return kek.getMessage();
    }
}
