package Main;

public class Завдання {
    private int id;
    private String title;
    private String description;
    private String deadline;
    private int maxScore;

    public Завдання() {}

    public Завдання(int id, String title, String description, String deadline, int maxScore) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.maxScore = maxScore;
    }

    public void submit() {}

    @Override
    public String toString() {
        return "Завдання{" +
                "id=" + id +
                ", назва='" + title + '\'' +
                ", опис='" + description + '\'' +
                ", дедлайн='" + deadline + '\'' +
                ", максБал=" + maxScore +
                '}';
    }
}
