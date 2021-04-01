package AlexLink.HomeWork.String;

import java.util.Arrays;

public class TextFormatter {
    private static String pattern = "\\s|([.,!?-]\\s)|\\.";
    protected static int countWordsInString(String str) {
        int count = 0;
        String[] del = str.split(pattern);
        for (String s : del) {
            count++;
        }
        return count;
    }
    protected static boolean checkPolindromInSentence(String str) {
        String[] del = str.split(pattern);
        for (String word : del) {
                char[] orderLetter = word.toCharArray();
                int countLetterInWord = 0;
                for (int j = 0; j < orderLetter.length / 2; j++) {
                    if (orderLetter[j] == orderLetter[orderLetter.length - 1 - j]) {
                        countLetterInWord = countLetterInWord + 2;
                    }
                    if (countLetterInWord == word.length() || countLetterInWord == word.length() - 1) {
                        return true;
                    }
                }
            }
        return false;
    }
}
