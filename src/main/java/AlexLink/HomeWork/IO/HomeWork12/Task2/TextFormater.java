package AlexLink.HomeWork.IO.HomeWork12.Task2;

public class TextFormater {

    public static int countWordsInSentence(String str) {
        return str.split("[,!?.]*\\s+").length;
    }

    public static boolean checkingForPolindrom(String str) {
        String[] temp = str.trim().split("[,!?.]*\\s+");
        for (String word : temp) {
            char[] wordToArray = word.toCharArray();
            if (wordToArray.length == 1) {
                return true;
            }
            int count = 0;
            for (int i = 0; i < wordToArray.length / 2; i++) {
                if (wordToArray[i] != wordToArray[wordToArray.length - 1 - i]) {
                    break;
                } else {
                    count++;
                }
                if (count == wordToArray.length / 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
