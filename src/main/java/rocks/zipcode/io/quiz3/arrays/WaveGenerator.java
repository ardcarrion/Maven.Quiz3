package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        ArrayList<String> strings = new ArrayList<>();
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            if (Character.isLetter(lowerCase.charAt(i))) {
                String capital = String.valueOf(lowerCase.charAt(i)).toUpperCase();
                strings.add(lowerCase.substring(0, i) + capital + lowerCase.substring(i+1, str.length()));
            }
        }
        return strings.toArray(new String[strings.size()]);
    }
}
