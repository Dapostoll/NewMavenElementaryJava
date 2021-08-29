package lesson17.homework.deadlock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kek {
    private Lol lol;

    public synchronized String getMessage() {
        return "kek";
    }

    public synchronized String getLolMessage() {
        return lol.getMessage();
    }
}
