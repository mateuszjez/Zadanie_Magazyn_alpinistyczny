import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    public void dodaj(Przedmiot przedmiot){
        przedmioty.add(przedmiot);
    }
    public List<Przedmiot> pobierz(){
        return przedmioty;
    }
    private List<Przedmiot> przedmioty = new ArrayList<>();
}
