package Main;

public class НавчальнийМатеріал {
    private int id;
    private String type;
    private String title;
    private String link;
    private String author;

    public НавчальнийМатеріал() {}

    public НавчальнийМатеріал(int id, String type, String title, String link, String author) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.link = link;
        this.author = author;
    }

    public void openMaterial() {}

    @Override
    public String toString() {
        return "НавчальнийМатеріал{" +
                "id=" + id +
                ", тип='" + type + '\'' +
                ", назва='" + title + '\'' +
                ", посилання='" + link + '\'' +
                ", автор='" + author + '\'' +
                '}';
    }
}
