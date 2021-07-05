package lesson4.homework.services;

import lesson4.homework.entities.Client;
import lesson4.homework.utils.Helper;

public class TransactionService {


    public void transferOfMoney(Client client, String accountId){
        Helper helper = new Helper();
        helper.idAccountCleintschecker(client.getAccountId(),accountId);
    }
}
