package Main;

public class Тест {
    private int id;
    private String questions;
    private int timeLimit;
    private int maxScore;
    private МодульКурсу module;

    public Тест() {}

    public Тест(int id, String questions, int timeLimit, int maxScore, МодульКурсу module) {
        this.id = id;
        this.questions = questions;
        this.timeLimit = timeLimit;
        this.maxScore = maxScore;
        this.module = module;
    }

    public void startTest() {}

    @Override
    public String toString() {
        return "Тест{" +
                "id=" + id +
                ", питання='" + questions + '\'' +
                ", час=" + timeLimit +
                ", максБал=" + maxScore +
                ", модуль=" + module +
                '}';
    }
}
