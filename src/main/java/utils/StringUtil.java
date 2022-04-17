package utils;

import java.util.List;

public class StringUtil {

    public static String changeListToString(List<Integer> list) {
        StringBuilder randomNumber = new StringBuilder();
        for (Integer n : list) {
            randomNumber.append(n);
        }
        return randomNumber.toString();
    }
}
