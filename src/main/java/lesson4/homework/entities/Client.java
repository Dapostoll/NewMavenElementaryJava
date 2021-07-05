package lesson4.homework.entities;

public class Client {
    private String id;
    private String lastname;
    private String accountId;
    private Double sum;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", accountId='" + accountId + '\'' +
                ", sum=" + sum +
                '}';
    }
}
