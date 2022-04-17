package service;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashMap;

public class ConsoleService {

    public enum Message {
        ENTER_NUMBER ("숫자를 입력해주세요 : "),
        GAME_OVER("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
        GAME_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
        NOTHING("낫싱");

       private final String value;

        Message(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static String readLine() {
        return Console.readLine();
    }
    private static void printConsole(String message) {
        System.out.println(message);
    }

    private static void printfConsole(String message) {
        System.out.printf("%s", message);
    }

    public static String enterNumber() {
        printfConsole(Message.ENTER_NUMBER.getValue());
        return readLine();
    }

    public static void gameOver() {
        printConsole(Message.GAME_OVER.getValue());
    }

    public static String gameRestart() {
        printConsole(Message.GAME_RESTART.getValue());
        return Console.readLine();
    }

    public static void nothing() {
        printConsole(Message.NOTHING.getValue());
    }

    public static void result(int ballCount, int strikeCount ) {
        printConsole(setResultScript(ballCount, strikeCount));
    }

    public static String setResultScript(int ballCount, int strikeCount) {
        return (setBallCount(ballCount) + " " + setStrikeCount(strikeCount)).trim();
    }

    private static String setBallCount(int ballCount) {
        String ball = "";
        if(ballCount > 0) {
            ball = ballCount + "볼";
        }
        return ball;
    }

    private static String setStrikeCount(int strikeCount) {
        String strike = "";
        if(strikeCount > 0) {
            strike = strikeCount + "스트라이크";
        }
        return strike;
    }
}
