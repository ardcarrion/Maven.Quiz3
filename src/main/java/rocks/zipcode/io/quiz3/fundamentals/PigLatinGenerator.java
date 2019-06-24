package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        if (words.length > 1) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) sb.append(translateWord(word) + " ");
            return sb.toString().trim();
        }
        return translateWord(str);
    }

    public String translateWord(String str) {
        if (VowelUtils.startsWithVowel(str)) return str + "way";
        else if (VowelUtils.hasVowels(str)){
            while (!VowelUtils.startsWithVowel(str)) str = str.substring(1) + str.charAt(0);
        }
        return str + "ay";
    }
}
