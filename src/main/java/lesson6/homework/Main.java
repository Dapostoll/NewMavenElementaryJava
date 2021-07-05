package lesson6.homework;

import lesson6.homework.exceptions.StringFormatException;
import lesson6.homework.utils.Helper;
import lesson6.homework.utils.StringHelper;

import java.util.Scanner;

/*
 * my github
 * https://github.com/Dapostoll
 * */

public class Main {
    public static void main(String[] args) {

        String string = " Art is a life! ";
        char[] array = {' ', 'd', 'e', 'k', 'o', ' '};

        StringHelper stringHelper = new StringHelper();
        try {
            System.out.println("Adjusted string: " + stringHelper.adjustString(string, array));
        } catch (StringFormatException e) {
            e.printStackTrace();
        }


        Helper helper = new Helper();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valid phone number: " + helper.validatePhone(scanner));

        System.out.println("Valid email: " + helper.validateEmail(scanner));

        System.out.println("Valid date of birth: " + helper.validateBirthday(scanner));
        scanner.close();
    }
}