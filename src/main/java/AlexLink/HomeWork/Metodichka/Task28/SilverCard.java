package AlexLink.HomeWork.Metodichka.Task28;

public class SilverCard extends TypeCard{

    private int price;
    private int id;

    public SilverCard(String levelClass, String bankName, String currencyCard, int price, int id) {
        super(levelClass, bankName, currencyCard);
        this.price = price;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    void createCard() {
        System.out.println("Серебряная карта создана");
    }
}
