package java8.homework.function;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalClass {

    public boolean predicateTaskOne(Double salary) {
        Predicate<Double> salaryResult = x -> x > 1500.0;
        return salaryResult.test(salary);
    }

    public void consumerTaskTwo(String string) {
        Consumer<String> printCharsFromString = (x) -> stringChars(x.toCharArray());
        printCharsFromString.accept(string);

    }

    private static void stringChars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void functionTaskThree(Integer integer) {

        Function<Integer, String> integerConverter = i -> converter(integer);
        System.out.println(integerConverter.apply(integer));


    }

    private static String converter(Integer integer) {
        switch (integer) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "invalid integer!";
        }
    }

    public void supplierTaskFour(Integer integer) {

        Supplier<Integer> yearsWithBoyfriend = () -> randomAge(integer);
        System.out.println("Years with your Boyfriend: " + yearsWithBoyfriend.get());

    }

    private Integer randomAge(Integer integer) {
        Random random = new Random();
        integer = random.nextInt(integer);
        return integer;
    }

}



