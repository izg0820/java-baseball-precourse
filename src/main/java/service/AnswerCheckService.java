package service;

import controller.GameController;
import view.ConsoleView;

public class AnswerCheckService {

    private static int isBall(char myAnswer, String answer) {
        return answer.indexOf(myAnswer) != -1 ? 1 : 0;
    }

    private static boolean isStrike(char myAnswer, char answer) {
        return myAnswer == answer;
    }

    public static boolean answerCheck(String myAnswer, String answer) {
        int ballCount = 0, strikeCount = 0;
        for (int i = 0; i < GameController.ANSWER_LENGTH; i++) {
            if (isStrike(myAnswer.charAt(i), answer.charAt(i))) {
                strikeCount++;
                continue;
            }
            ballCount += isBall(myAnswer.charAt(i), answer);
        }
        return ConsoleView.printResult(ballCount, strikeCount, answer.length());
    }

    public static boolean isCorrect(int ballCount, int strikeCount, int answerLength) {
        return ballCount == 0 && strikeCount == answerLength;
    }

    public static boolean isNothing(int ballCount, int strikeCount) {
        return ballCount == 0 && strikeCount == 0;
    }

}
