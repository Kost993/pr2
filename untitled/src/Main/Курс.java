package Main;

public class Курс {
    private int id;
    private String name;
    private String description;
    private Викладач teacher;
    private String students;
    private String startDate;
    private String endDate;

    public Курс() {}

    public Курс(int id, String name, String description, Викладач teacher,
                String students, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addStudent() {}
    public void removeStudent() {}

    @Override
    public String toString() {
        return "Курс{" +
                "id=" + id +
                ", назва='" + name + '\'' +
                ", опис='" + description + '\'' +
                ", викладач=" + teacher +
                ", студенти='" + students + '\'' +
                ", початок='" + startDate + '\'' +
                ", кінець='" + endDate + '\'' +
                '}';
    }
}
