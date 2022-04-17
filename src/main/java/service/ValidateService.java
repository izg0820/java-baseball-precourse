package service;

import controller.GameController;
import utils.Message;

public class ValidateService {

    public static void validateNumberLength(final String number) {
        if (number.length() > GameController.ANSWER_LENGTH) {
            throw new IllegalArgumentException(Message.INPUT_NUMBER_SHORT.getValue());
        }

        if (number.length() < GameController.ANSWER_LENGTH) {
            throw new IllegalArgumentException(Message.INPUT_NUMBER_LONG.getValue());
        }
    }

    public static void validateNumber(final String number) {
        final String regex = "^[0-9]+$";
        if (!number.matches(regex)) {
            throw new IllegalArgumentException(Message.INPUT_NUMBER_NOT_NUMERIC.getValue());
        }
    }
}
