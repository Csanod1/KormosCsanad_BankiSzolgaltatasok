package hu.petrik.hu;

public class Kartya extends BankiSzolgaltatas{
    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam(){
        return String.format(this.kartyaSzam);
    }

    public boolean vasarlas(int osszeg){
        if (szamla.aktualisEgyenleg - osszeg >= 0){
            szamla.aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }

}
