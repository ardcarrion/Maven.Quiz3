package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder result = new StringBuilder();
        if (indexToCapitalize >= str.length()) throw new IndexOutOfBoundsException();
        result.append(str.substring(0,indexToCapitalize)).append(String.valueOf(str.charAt(indexToCapitalize)).toUpperCase());
        return result.append(str.substring(indexToCapitalize+1)).toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                substrings.add(string.substring(i, j));
            }
        }
        return substrings.toArray(new String[substrings.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return n*(n+1)/2 - 1;
    }
}
