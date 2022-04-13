package service;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleService {

    public enum Message {
        ENTER_NUMBER ("숫자를 입력해주세요 : "),
        GAME_OVER("3개의숫자를모두맞히셨습니다! 게임종료"),
        GAME_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        private final String value;

        Message(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    private static void printConsole(String message) {
        System.out.printf("%s", message);
    }

    public static void enterNumber() {
        printConsole(Message.ENTER_NUMBER.getValue());
    }

    public static void gameOVer() {
        printConsole(Message.GAME_OVER.getValue());
    }

    public static void gameRestart() {
        printConsole(Message.GAME_RESTART.getValue());
    }

    public static void result(int ballCount, int strikeCount) {
        printConsole(setResultScript(ballCount, strikeCount));
    }

    public static String setResultScript(int ballCount, int strikeCount) {
        return (setBallCount(ballCount) + " " + setStrikeCount(strikeCount)).trim();
    }

    public static String setBallCount(int ballCount) {
        String ball = "";
        if(ballCount > 0) {
            ball = ballCount + "볼";
        }
        return ball;
    }

    public static String setStrikeCount(int strikeCount) {
        String strike = "";
        if(strikeCount > 0) {
            strike = strikeCount + "스트라이크";
        }
        return strike;
    }
}
