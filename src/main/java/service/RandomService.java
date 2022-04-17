package service;

import camp.nextstep.edu.missionutils.Randoms;
import controller.GameController;
import utils.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class RandomService {

    public static String getRandomNumbers() {
        List<Integer> numberList = new ArrayList<>();
        while (numberList.size() < GameController.ANSWER_LENGTH) {
            addNumberToList(numberList, Randoms.pickNumberInRange(1, 9));
        }
        return StringUtil.changeListToString(numberList);
    }

    private static void addNumberToList(List<Integer> list, int randomNum) {
        if(!isNumberInList(list, randomNum)) {
            list.add(randomNum);
        }
    }

    private static boolean isNumberInList(List<Integer> list, int randomNum) {
        return list.contains(randomNum);
    }

}
