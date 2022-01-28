public class Bog {
    private int isbn;
    private String title;
    private int udgivelsesår;

    public Bog(int isbn, String title, int udgivelsesår) {
        this.isbn = isbn;
        this.title = title;
        this.udgivelsesår = udgivelsesår;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }
}
