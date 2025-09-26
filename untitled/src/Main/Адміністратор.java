package Main;

public class Адміністратор {
    private int id;
    private String users;
    private String accessLevel;

    public Адміністратор() {}

    public Адміністратор(int id, String users, String accessLevel) {
        this.id = id;
        this.users = users;
        this.accessLevel = accessLevel;
    }

    public void manageUsers() {}
    public void systemSupport() {}

    @Override
    public String toString() {
        return "Адміністратор{" +
                "id=" + id +
                ", користувачі='" + users + '\'' +
                ", рівень доступу='" + accessLevel + '\'' +
                '}';
    }
}
