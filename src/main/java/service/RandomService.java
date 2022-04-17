package service;

import camp.nextstep.edu.missionutils.Randoms;
import controller.GameController;

import java.util.ArrayList;
import java.util.List;

public class RandomService {



    public static String getRandomNumbers() {
        List<Integer> numberList = new ArrayList<>();
        while (numberList.size() < GameController.ANSWER_LENGTH) {
            addNumberToList(numberList, Randoms.pickNumberInRange(1, 9));
        }
        return changeListToString(numberList);
    }

    private static void addNumberToList(List<Integer> list, int randomNum) {
        if(!isNumberInList(list, randomNum)) {
            list.add(randomNum);
        }
    }

    private static boolean isNumberInList(List<Integer> list, int randomNum) {
        return list.contains(randomNum);
    }

    private static String changeListToString(List<Integer> list) {
        StringBuilder randomNumber = new StringBuilder();
        for (Integer n : list) {
            randomNumber.append(n);
        }
        return randomNumber.toString();
    }
}
