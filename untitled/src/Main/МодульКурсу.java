package Main;

public class МодульКурсу {
    private String name;
    private int number;
    private String materials;
    private String tasks;

    public МодульКурсу() {}

    public МодульКурсу(String name, int number, String materials, String tasks) {
        this.name = name;
        this.number = number;
        this.materials = materials;
        this.tasks = tasks;
    }

    public void addMaterial() {}
    public void addTask() {}

    @Override
    public String toString() {
        return "МодульКурсу{" +
                "назва='" + name + '\'' +
                ", номер=" + number +
                ", матеріали='" + materials + '\'' +
                ", завдання='" + tasks + '\'' +
                '}';
    }
}
