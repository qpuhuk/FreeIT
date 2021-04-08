package AlexLink.HomeWork.HW7.Notepad;



import java.time.LocalDate;

public class Notepad {

    private LocalDate date;
    private Note note1;
    private Note note2;

    public Notepad(LocalDate date) {
        this.date = date;
        this.note1 = new Note("Сходить в магазин");
        this.note2 = new Note("Позвонить на работу");
    }

    public void setNote1(String str) {
        if (str != null && str.length() > 3)
            this.note1 = new Note(str);
    }

    @Override
    public String toString() {
        return "График: " +
                "дата = " + date +
                ", запись №1 = " + note1 +
                ", запись №2 = " + note2;
    }

    private class Note {
        private String note1;

        public Note(String note1) {
            this.note1 = note1;
        }

        @Override
        public String toString() {
            return note1;
        }
    }
}
