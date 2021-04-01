package AlexLink.HomeWork.String;

//Дополнительное задание
//
//1) Найти в строке не только запятые, но и другие знаки препинания.
//Подсчитать общее их количество.


import java.util.Arrays;

public class TaskAdd {
    public static void main(String[] args) {
        final String SENTENCE = "Ехал я по городу и услышал топот! Обернулся, а там стая лошадей. " +
                "Стоят и смотрят на меня завораживающе. Я поехал дальше. Когда доехал до водопада, увидел, что там потоп?";
        String pattern = "[,.!?:;\\-]";
        int before = SENTENCE.length();
        int after = SENTENCE.replaceAll(pattern, "").length();
        int count = before - after;
        System.out.println("Количество знаков препинания в тексте = " + count);

//2) Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.

        StringBuilder stringBuilder = new StringBuilder();
        String pattern2 = "\\s|[,.!?]\\s|[,.!?]";
        String[] divSentence = SENTENCE.split(pattern2);
        for (String temp : divSentence) {
            String word = temp.trim();
            stringBuilder.append(word.charAt(word.length() - 1));
        }
        System.out.println("Текст, составленный из последних букв всех слов ----" + stringBuilder.toString());
    }
}
