package lesson12.homework.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Status {
    private int id;
    private String alias;
    private String description;
}
