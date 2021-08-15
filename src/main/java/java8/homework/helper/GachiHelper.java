package java8.homework.helper;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GachiHelper {

    public Optional<String> gachiHelperMethod(String email) {
        String regEx = "([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})";
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);


        if (email != null) {
            Matcher matcher = pattern.matcher(email);
            while (!matcher.matches() || email.isEmpty()) {
                return Optional.empty();
            }
        }
        return Optional.ofNullable(email);
    }
}
