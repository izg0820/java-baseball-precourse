package utils;

import controller.GameController;

public enum Message {

    ENTER_NUMBER ("숫자를 입력해주세요 : "),
    GAME_OVER(GameController.ANSWER_LENGTH +"개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GAME_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    NOTHING("낫싱"),
    BALL("볼"),
    STRIKE("스트라이크"),
    INPUT_NUMBER_SHORT("Input number can't be longer than answer"),
    INPUT_NUMBER_LONG("Input number can't be shorter than answer"),
    INPUT_NUMBER_NOT_NUMERIC("Input number contain non-numeric characters"),
    INPUT_NUMBER_NOT_IN_RANGE("Input number isn't included in the selection range");

    private final String value;

    Message(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
