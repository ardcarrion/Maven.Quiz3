package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        if (squaredValues.length != inputArray.length) return false;
        List<Integer> input = Arrays.asList(inputArray);
        List<Integer> squared = Arrays.asList(squaredValues);
        Collections.sort(input);
        Collections.sort(squared);
        int index = 0;
        for (Integer i : input) {
            if (!squared.get(index).equals(i*i)) return false;
            index++;
        }
        return true;
    }
}
