package service;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashMap;

public class GameService {

    private String randomNumbers;
    private String isExit;


    public GameService() {
        this.randomNumbers = RandomService.getRandomNumbers();
        this.isExit = "1";
    }

    public void start() {
        while ("1".equals(isExit)) {
//            System.out.println("randomNumbers = " + randomNumbers);
            String myAnswer = ConsoleService.enterNumber();
            validate(myAnswer);
            if(AnswerCheckService.answerCheck(myAnswer, this.randomNumbers)){
                gameOver();
                restart();
            }
        }
    }

    private void restart() {
        isExit = ConsoleService.gameRestart();
        if ("1".equals(isExit)) {
            this.randomNumbers = RandomService.getRandomNumbers();
        }
    }

    private void gameOver() {
        ConsoleService.gameOver();
    }

    private void validate(String myAnswer) {
        ValidateService.validateNumber(myAnswer);
        ValidateService.validateNumberLength(myAnswer);
    }

}
