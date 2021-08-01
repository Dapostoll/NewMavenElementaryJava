package lesson12.homework.entities;


import lombok.Data;

@Data
public class Account {
    private int id;
    private int clientId;
    private String number;
    private double value;
}
