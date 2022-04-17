package service;

import java.io.Console;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class AnswerCheckService {

    private static int isBall(char myAnswer, String answer) {
        return answer.indexOf(myAnswer) != -1 ? 1 : 0;
    }

    private static boolean isStrike(char myAnswer, char answer) {
        return myAnswer == answer;
    }

    public static boolean answerCheck(String myAnswer, String answer) {
        int ballCount = 0, strikeCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (isStrike(myAnswer.charAt(i), answer.charAt(i))) {
                strikeCount++;
                continue;
            }
            ballCount += isBall(myAnswer.charAt(i), answer);
        }
        return printResult(ballCount, strikeCount, answer.length());
    }

    private static boolean printResult(int ballCount, int strikeCount, int answerLength) {
        if (isNothing(ballCount, strikeCount)) {
            ConsoleService.nothing();
            return false;
        }
        ConsoleService.result(ballCount, strikeCount);
        return isCorrect(ballCount, strikeCount, answerLength);
    }


    public static boolean isCorrect(int ballCount, int strikeCount, int answerLength) {
        return ballCount == 0 && strikeCount == answerLength;
    }

    private static boolean isNothing(int ballCount, int strikeCount) {
        return ballCount == 0 && strikeCount == 0;
    }

}
