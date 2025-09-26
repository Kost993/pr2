package Main;

public class Main {
    public static void main(String[] args) {
        Користувач user = new Користувач(1, "Іван Іваненко", "ivan@example.com", "1234", "студент", "2025-09-26");
        Студент student = new Студент(1, "Math, Java", 95.5, "70%");
        Викладач teacher = new Викладач("Java, Math", "teacher@example.com", "PhD");
        Адміністратор admin = new Адміністратор(1, "Список користувачів", "повний");
        Курс course = new Курс(101, "Java Basics", "Базовий курс по Java", teacher, "Список студентів", "2025-10-01", "2025-12-01");
        МодульКурсу module = new МодульКурсу("Вступ", 1, "Лекції", "Домашні завдання");
        НавчальнийМатеріал material = new НавчальнийМатеріал(1, "відео", "Вступ до Java", "file.mp4", "Іван Іваненко");
        Завдання task = new Завдання(1, "Лабораторна №1", "Написати Hello World", "2025-10-05", 10);
        Тест test = new Тест(1, "Питання", 30, 20, module);
        Оцінка grade = new Оцінка(student, task, 9, "2025-10-06");

        System.out.println(user);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(admin);
        System.out.println(course);
        System.out.println(module);
        System.out.println(material);
        System.out.println(task);
        System.out.println(test);
        System.out.println(grade);
    }
}
