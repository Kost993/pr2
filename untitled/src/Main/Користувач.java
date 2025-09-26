package Main;

public class Користувач {
    private int id;
    private String pib;
    private String email;
    private String password;
    private String role;
    private String date;

    public Користувач() {}

    public Користувач(int id, String pib, String email, String password, String role, String date) {
        this.id = id;
        this.pib = pib;
        this.email = email;
        this.password = password;
        this.role = role;
        this.date = date;
    }

    public void login() {}
    public void logout() {}

    @Override
    public String toString() {
        return "Користувач{" +
                "id=" + id +
                ", ПІБ='" + pib + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", дата='" + date + '\'' +
                '}';
    }
}
