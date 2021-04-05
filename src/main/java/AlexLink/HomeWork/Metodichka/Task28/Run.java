package AlexLink.HomeWork.Metodichka.Task28;

//Задание 27
//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.

import java.util.ArrayList;
import java.util.Collections;

public class Run {
    public static void main(String[] args) {

        ArrayList<BankCard> bankCards = new ArrayList<>();

        SilverCard silverCard = new SilverCard("High", "BelarusGavnoBank", "Maestro", 40, 2231123);
        GoldCard goldCard = new GoldCard("low", "MTGovnoTheSameBank", "Abroad", 1);
        OverdraftCard overdraftCard = new OverdraftCard("Business", "AmericanBank", "Abroad", true, 5);

        Collections.addAll(bankCards, silverCard, goldCard, overdraftCard);

        bankCards.forEach(BankCard::createCard);
    }
}
