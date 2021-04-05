package AlexLink.HomeWork.Metodichka.Task28;

public abstract class BankCard {

    private String levelClass;
    private  String BankName;

    public BankCard(String levelClass, String bankName) {
        this.levelClass = levelClass;
        BankName = bankName;
    }

    public String getLevelClass() {
        return levelClass;
    }

    public void setLevelClass(String levelClass) {
        this.levelClass = levelClass;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    abstract void createCard();
}
