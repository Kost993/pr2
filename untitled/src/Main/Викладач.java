package Main;

public class Викладач {
    private String courses;
    private String contact;
    private String degree;

    public Викладач() {}

    public Викладач(String courses, String contact, String degree) {
        this.courses = courses;
        this.contact = contact;
        this.degree = degree;
    }

    public void createCourse() {}
    public void checkTask() {}

    @Override
    public String toString() {
        return "Викладач{" +
                "курси='" + courses + '\'' +
                ", контакт='" + contact + '\'' +
                ", ступінь='" + degree + '\'' +
                '}';
    }
}
