package AlexLink.HomeWork.Metodichka.Task28;

public class GoldCard extends TypeCard{

    private int percentDiscount;

    public GoldCard(String levelClass, String bankName, String currencyCard, int percentDiscount) {
        super(levelClass, bankName, currencyCard);
        this.percentDiscount = percentDiscount;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    void createCard() {
        System.out.println("Золотая карта создана");
    }
}
