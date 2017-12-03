public class Przedmiot {
    public  Przedmiot() {}
    public  Przedmiot(String opis_in) {
        this.opis = opis_in;
    }
    public void wyswietl() {
        System.out.print(opis);
    }
    public String PobierzOpis(){
        return this.opis;
    }
    protected void ustaw_opis(String opis_in){
        this.opis = opis_in;
    }
    private String opis="";
}
