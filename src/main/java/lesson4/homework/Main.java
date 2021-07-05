package lesson4.homework;

import lesson4.homework.entities.Client;
import lesson4.homework.exceptions.WrongFieldException;
import lesson4.homework.exceptions.WrongSumException;
import lesson4.homework.services.TransactionService;
import lesson4.homework.utils.Helper;


import java.util.Scanner;

/*
* my github
* https://github.com/Dapostoll
* */

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Helper helper = new Helper();
        Client client = new Client();
        TransactionService transactionService = new TransactionService();

        System.out.println("Enter account client ID");
        String enteredAccountIdResult = scanner.nextLine();
        String sendsEnteredAccountIdResult = checkerSendsEnteredAccountIdResult(enteredAccountIdResult,helper);

        System.out.println("Enter recipient account client ID");
        String enteredAccountClientIdResult = scanner.nextLine();
        String recipientEnteredAccountClientIdResult = checkerSendsEnteredAccountIdResult(enteredAccountClientIdResult,helper);

        System.out.println("Enter sum");
        Double enteredSumResult = scanner.nextDouble();
        Double sendsEnteredSumResult = checkerSendsEnteredSum(enteredSumResult,helper);

        System.out.println("Sum of transaction is started");
        client.setAccountId(enteredAccountIdResult);
        client.setSum(enteredSumResult);
        transactionService.transferOfMoney(client,enteredAccountClientIdResult);
        System.out.println("Money Transaction is successful!");

    scanner.close();


    }

    public static void enterAccountId(Helper helper) {

        System.out.println("Enter account client ID");
        String enteredAccountIdResult = scanner.nextLine();
        String sendsEnteredAccountIdResult = checkerSendsEnteredAccountIdResult(enteredAccountIdResult,helper);

    }

    public static void enterAccountClientId(Helper helper) {

        System.out.println("Enter recipient account client ID");
        String enteredAccountClientIdResult = scanner.nextLine();
        String recipientEnteredAccountClientIdResult = checkerSendsEnteredAccountIdResult(enteredAccountClientIdResult,helper);

    }
    public static void enterSum(Helper helper) {

        System.out.println("Enter sum");
        Double enteredSumResult = scanner.nextDouble();
        Double sendsEnteredSumResult = checkerSendsEnteredSum(enteredSumResult,helper);

    }

    public static void transactionservicechecker(Client client, TransactionService transactionService, String enteredAccountIdResult,Double enteredSumResult,
                                                 String enteredAccountClientIdResult, Helper helper){
        System.out.println();
        client.setAccountId(enteredAccountIdResult);
        client.setSum(enteredSumResult);

        transactionService.transferOfMoney(client,enteredAccountClientIdResult);
    }

    public static String checkerSendsEnteredAccountIdResult(String accountId, Helper helper) {
        while (accountId.length() != 10) {
            try {
                helper.checkerIdClint(accountId);
            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
            System.out.println("Account Id length should be 10.\n" +
                    "Enter Account Id again: ");
            accountId = scanner.nextLine();
        }
        return accountId;
    }
    public static Double checkerSendsEnteredSum(Double sum, Helper helper) {
        if (sum > 1000) {
            try {
                helper.checkerSum(sum);
            } catch (WrongSumException e) {
                e.printStackTrace();
            }
            System.out.println("Sum need to be < 1000.\n" +
                    "Enter Sum again: ");
            sum = scanner.nextDouble();
        }
        return sum;
    }



}