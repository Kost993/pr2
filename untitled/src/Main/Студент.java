package Main;

public class Студент {
    private int id;
    private String courses;
    private double rating;
    private String progress;

    public Студент() {}

    public Студент(int id, String courses, double rating, String progress) {
        this.id = id;
        this.courses = courses;
        this.rating = rating;
        this.progress = progress;
    }

    public void enrollCourse() {}
    public void passTest() {}

    @Override
    public String toString() {
        return "Студент{" +
                "id=" + id +
                ", курси='" + courses + '\'' +
                ", рейтинг=" + rating +
                ", прогрес='" + progress + '\'' +
                '}';
    }
}
