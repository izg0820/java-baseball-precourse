package view;

import camp.nextstep.edu.missionutils.Console;
import service.AnswerCheckService;
import utils.Message;
import utils.MessageUtil;

public class ConsoleView {

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
        printConsole(MessageUtil.setResultScript(ballCount, strikeCount));
    }

    public static boolean printResult(int ballCount, int strikeCount, int answerLength) {
        if (AnswerCheckService.isNothing(ballCount, strikeCount)) {
            ConsoleView.nothing();
            return false;
        }
        ConsoleView.result(ballCount, strikeCount);
        return AnswerCheckService.isCorrect(ballCount, strikeCount, answerLength);
    }

}
