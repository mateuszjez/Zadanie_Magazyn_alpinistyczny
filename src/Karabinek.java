public class Karabinek extends Przedmiot {
    public Karabinek() {
        ustaw_opis("Karabinek standard");
        this.typ = TypKarabinka.zakrecany;
    }
    public Karabinek(TypKarabinka typ_in) {
        ustaw_opis("Karabinek standard");
        this.typ = typ_in;
    }
    public Karabinek(String opis_in, TypKarabinka typ_in) {
        ustaw_opis(opis_in);
        this.typ = typ_in;
    }
    public TypKarabinka typ;
}
