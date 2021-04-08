package AlexLink.HomeWork.HW7.Gradebook;


public class GradeBook {

    int allScore;
    private int countExam;
    private double middleScore;

    public int getCountExam() {
        return countExam;
    }

    public double getMiddleScore() {
        return (double) allScore / countExam;
    }

    public Exam addExam(String nameExam, int score, String version) {

        return new Exam(nameExam, score, version);
    }

    @Override
    public String toString() {
        return "Зачетная книжка: ";
    }

    protected class Exam {
        private final String nameExam;
        private final int score;
        private final String version;

        public Exam(String exam, int score, String version) {
            this.version = version;
            this.nameExam = exam;
            this.score = score;
            countExam++;
            allScore += score;
        }

        @Override
        public String toString() {
            return "Название предмета - " + nameExam +
                    ", оценка = " + score +
                    ", вид проведения - " + version;
        }
    }

}
