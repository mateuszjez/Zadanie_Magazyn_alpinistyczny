import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Magazyn_alpinistyczny {
    public static void main(String[] args){
        Magazyn magazyn = new Magazyn();
        magazyn.dodaj(new Lina(50));
        magazyn.dodaj(new Karabinek());
        magazyn.dodaj(new Karabinek(TypKarabinka.niezakrecany));
        magazyn.dodaj(new Karabinek("Mammut",TypKarabinka.niezakrecany));
        List<Przedmiot> przedmioty = new ArrayList<>();
        przedmioty = magazyn.pobierz();
        Iterator<Przedmiot> iterator=przedmioty.iterator();
        for (iterator.)
    }
}
