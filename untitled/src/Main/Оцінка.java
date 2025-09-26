package Main;

public class Оцінка {
    private Студент student;
    private Object work; // Завдання або Тест
    private int score;
    private String date;

    public Оцінка() {}

    public Оцінка(Студент student, Object work, int score, String date) {
        this.student = student;
        this.work = work;
        this.score = score;
        this.date = date;
    }

    public void updateScore() {}

    @Override
    public String toString() {
        return "Оцінка{" +
                "студент=" + student +
                ", робота=" + work +
                ", бал=" + score +
                ", дата='" + date + '\'' +
                '}';
    }
}
