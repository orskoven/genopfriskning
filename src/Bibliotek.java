import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bøger = new ArrayList<>();

    public Bibliotek() {
    }

    public void tilføjBog(Bog nyBog) {
        this.bøger.add(nyBog);
    }

    public boolean isISBNAlreadyInLibrary(Bog bog){
        boolean isIsbnPresent = false;
        for (int i = 0; i < bøger.size() && bøger.get(i).getIsbn() == bog.getIsbn(); i++) {
            isIsbnPresent = true;
        }
        return isIsbnPresent;
    }

    public static void main(String[] args) {
        Bog krigOgFred = new Bog(123456789,"Krig og fred",1990);
        Bog mySql = new Bog(357586333,"Mysql",1990);
        Bog advancedJava = new Bog(66666666,"Advanced Java",1990);
        Bog k = new Bog(111111, "k", 1990);
        Bibliotek bibliotek = new Bibliotek();
        bibliotek.tilføjBog(krigOgFred);
        bibliotek.tilføjBog(mySql);
        bibliotek.tilføjBog(advancedJava);

        System.out.println(bibliotek.isISBNAlreadyInLibrary(k));
    }
    }

