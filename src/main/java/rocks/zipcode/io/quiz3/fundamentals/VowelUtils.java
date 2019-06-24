package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return getIndexOfFirstVowel(word) > 0;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) if (isVowel(chars[i])) return i;
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if (word.length() == 0) return false;
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) if (vowel.equalsIgnoreCase(character.toString())) return true;
        return false;
    }
}
