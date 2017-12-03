public class Lina extends Przedmiot {
    public Lina(int dl) {
        ustaw_opis("Lina standard");
        dlugosc = dl;
    }
    public Lina(String opis_in, int dl) {
        ustaw_opis(opis_in);
        dlugosc = dl;
    }
    public void wyswietl() {
        System.out.print();
    }
    public int dlugosc;
}
