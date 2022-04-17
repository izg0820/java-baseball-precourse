package utils;

import camp.nextstep.edu.missionutils.Console;
import controller.GameController;

public class ConsoleUtil {

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
            ball = ballCount + Message.BALL.getValue();
        }
        return ball;
    }

    private static String setStrikeCount(int strikeCount) {
        String strike = "";
        if(strikeCount > 0) {
            strike = strikeCount + Message.STRIKE.getValue();
        }
        return strike;
    }
}
