package AlexLink.HomeWork.HomeworkLists;

//Задание 32
//
//Имеется текст. Следует составить для него частотный словарь.

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class Lists3 {
    public static void main(String[] args) {
        String text = "Ночь, улица, фонарь, аптека,\n" +
                "Бессмысленный и тусклый свет.\n" +
                "Живи еще хоть четверть века —\n" +
                "Все будет так. Исхода нет.\n" +
                "Умрешь — начнешь опять сначала\n" +
                "И повторится все, как встарь:\n" +
                "Ночь, ледяная рябь канала,\n" +
                "Аптека, улица, фонарь.";
        List<String>splitText = Arrays.asList(text.toLowerCase().split("\\s*+[.,!?—:]+\\s*+|\\s+"));
        Map<String, Integer> dictionaryNoSort = new HashMap<>();
        System.out.println("Текст, разбитый по словам и переведенный в нижний регистр = " + splitText);
        int count = 0;
        while (true){
            int quantity = Collections.frequency(splitText,splitText.get(count));
            dictionaryNoSort.putIfAbsent(splitText.get(count), quantity);
            count++;
            if (count == splitText.size())
                break;
        }
        System.out.println("Неотсортированный словарь = " + dictionaryNoSort);

        List<Map.Entry<String,Integer>>list = new ArrayList<>(dictionaryNoSort.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getKey().charAt(0) != o2.getKey().charAt(0)) {
                    return o1.getKey().charAt(0) - o2.getKey().charAt(0);
                }
                else {
                    if (o1.getKey().length() > 1 && o2.getKey().length() > 1)
                    return o1.getKey().charAt(1) - o2.getKey().charAt(1);
                }
                return o1.getKey().charAt(0) - o2.getKey().charAt(0);
            }
        });
        System.out.println("Отсортированный словарь по алфавиту: ");
        list.forEach(System.out::println);


    }
}
