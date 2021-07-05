package lesson4.homework.utils;

import lesson4.homework.entities.Client;
import lesson4.homework.exceptions.UserExpectedError;
import lesson4.homework.exceptions.WrongFieldException;
import lesson4.homework.exceptions.WrongSumException;

public class Helper {



    public void checkerIdClint(String accountId) throws WrongFieldException {
        if (accountId.length() != 10) {
            throw new WrongFieldException("WrongFieldException");
        }
    }

    public void checkerSum(Double sum) throws WrongSumException {
        if (sum > 1000.00){
            throw new WrongSumException("WrongSumException");
        }
    }

    public void idAccountCleintschecker(String enteredAccountIdResult, String enteredAccountClientIdResult){
        if (enteredAccountIdResult.equals(enteredAccountClientIdResult)){
            throw new UserExpectedError("UserExpectedError");
        }
    }


}
