package service;

import java.util.HashMap;

public class AnswerCheckService {

    private static int isBall(char myAnswer, String answer) {
        return answer.indexOf(myAnswer) != -1 ? 1 : 0;
    }

    private static boolean isStrike(char myAnswer, char answer) {
        return myAnswer == answer;
    }

    public static HashMap<String, Integer> answerCheck(String myAnswer, String answer) {
        int ballCount = 0, strikeCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (isStrike(myAnswer.charAt(i), answer.charAt(i))) {
                strikeCount++;
                continue;
            }
            ballCount += isBall(myAnswer.charAt(i), answer);
        }
        return setResult(ballCount, strikeCount);
    }

    private static HashMap<String, Integer> setResult(int ball, int strike) {
        return new HashMap<String, Integer>() {{
            put("BALL", ball);
            put("STRIKE", strike);
        }};
    }

    public static boolean isCorrect(HashMap<String, Integer> result, int numberSize) {
        return result.get("BALL") == 0 && result.get("STRIKE") == numberSize;
    }

}
