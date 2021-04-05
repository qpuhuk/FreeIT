package AlexLink.HomeWork.Metodichka.Task28;

public abstract class TypeCard extends BankCard{

    private String currencyCard;

    public TypeCard(String levelClass, String bankName, String currencyCard) {
        super(levelClass, bankName);
        this.currencyCard = currencyCard;
    }

    public String getCurrencyCard() {
        return currencyCard;
    }

    public void setCurrencyCard(String currencyCard) {
        this.currencyCard = currencyCard;
    }

    abstract void createCard();

}
