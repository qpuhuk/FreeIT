package AlexLink.HomeWork.String;

//4)Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл.
//Пишем все в ООП стиле. Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
//В main считываем файл.
//Разбиваем текст на предложения. Используя методы класса TextFormater
//определяем подходит ли нам предложение. Если подходит добавляем его в
//новый файл

public class Task4 {
    public static final String SENTENCE = "Ехал я по городу и услышал топот. Обернулся, а там стая лошадей. " +
            "Стоят и смотрят на меня завораживающе. Я поехал дальше. Когда доехал до водопада, увидел, что там потоп.";

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String pattern = "\\.";
        String[] divSentence = SENTENCE.split(pattern);
        for (String temp : divSentence) {
            String format = temp.trim();
            int countWord = TextFormatter.countWordsInString(format);
            if ((countWord >= 3 && countWord <= 5) || TextFormatter.checkPolindromInSentence(format)) {
                stringBuilder.append(format).append(". ");
            }
        }
        System.out.println(stringBuilder);
    }
}
