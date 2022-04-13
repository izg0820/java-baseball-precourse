package service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomService {

    public List<Integer> getRandomNumbers() {
        List<Integer> numberList = new ArrayList<>();
        while (numberList.size() < 3) {
            addNumberToList(numberList, Randoms.pickNumberInRange(1, 9));
        }
        return numberList;
    }

    private void addNumberToList(List<Integer> list, int randomNum) {
        if(!isNumberInList(list, randomNum)) {
            list.add(randomNum);
        }
    }

    private boolean isNumberInList(List<Integer> list, int randomNum) {
        return list.contains(randomNum);
    }
}
