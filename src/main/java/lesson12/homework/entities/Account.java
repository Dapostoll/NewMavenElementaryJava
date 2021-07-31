package lesson12.homework.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
    private int id;
    private int clientId;
    private String number;
    private double value;
}
