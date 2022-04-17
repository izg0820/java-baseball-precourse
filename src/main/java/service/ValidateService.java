package service;

public class ValidateService {

    public static void validateNumberLength(final String number) {
        if (number.length() > 3) {
            throw new IllegalArgumentException("Input number can't be longer than answer");
        }

        if (number.length() < 3) {
            throw new IllegalArgumentException("Input number can't be shorter than answer");
        }
    }

    public static void validateNumber(final String number) {
        final String regex = "^[0-9]+$";
        if (!number.matches(regex)) {
            throw new IllegalArgumentException("Input number contain non-numeric characters");
        }
    }
}
