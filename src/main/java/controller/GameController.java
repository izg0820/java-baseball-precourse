package controller;

import service.AnswerCheckService;
import view.ConsoleView;
import service.RandomService;
import service.ValidateService;

public class GameController {

    private String randomNumbers;
    private String isExit;

    public static final int ANSWER_LENGTH = 3;

    public GameController() {
        this.randomNumbers = RandomService.getRandomNumbers();
        this.isExit = "1";
    }

    public void start() {
        while ("1".equals(isExit)) {
            String myAnswer = ConsoleView.enterNumber();
            validate(myAnswer);
            if(AnswerCheckService.answerCheck(myAnswer, this.randomNumbers)){
                gameOver();
                restart();
            }
        }
    }

    private void restart() {
        isExit = ConsoleView.gameRestart();
        if ("1".equals(isExit)) {
            this.randomNumbers = RandomService.getRandomNumbers();
        }
    }

    private void gameOver() {
        ConsoleView.gameOver();
    }

    private void validate(String myAnswer) {
        ValidateService.validateNumber(myAnswer);
        ValidateService.validateNumberLength(myAnswer);
    }

}
