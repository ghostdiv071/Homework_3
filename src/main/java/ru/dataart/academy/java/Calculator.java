package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        return reverseNumFromList(firstNumber) + reverseNumFromList(secondNumber);
    }

    /**
     * @param list - list of numbers in reverse order
     * @return - number in direct order
     */
    private int reverseNumFromList(List<Integer> list) {
        int result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += list.get(i) * Math.pow(10, i);
        }
        return result;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            result.add(list.get(i));
        }
        return result;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        if (list.size() == 1) {
            return Collections.singletonList(list.get(0));
        }
        return Arrays.asList(list.get(0), list.get(list.size() - 1));
    }
}
