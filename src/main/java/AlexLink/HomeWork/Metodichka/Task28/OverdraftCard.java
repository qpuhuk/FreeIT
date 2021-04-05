package AlexLink.HomeWork.Metodichka.Task28;

public class OverdraftCard extends TypeCard{

    private boolean credit;
    private int percent;

    public OverdraftCard(String levelClass, String bankName, String currencyCard, boolean credit, int percent) {
        super(levelClass, bankName, currencyCard);
        this.credit = credit;
        this.percent = percent;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    void createCard() {
        System.out.println("Овердрафт карта создана");
    }
}
