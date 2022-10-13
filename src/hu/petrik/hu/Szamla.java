package hu.petrik.hu;

import hu.petrik.hu.BankiSzolgaltatas;

public class Szamla extends BankiSzolgaltatas {
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg(){
        return this.aktualisEgyenleg;
    }
    public void befizet(int osszeg){
        this.aktualisEgyenleg += osszeg;
    }
    public boolean kivesz(int osszeg){
        if (this.aktualisEgyenleg >= osszeg ){
            this.aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }
    public Kartya ujKartya(String kartyaSzam){
        Tulajdonos ujTulajdonos = new Tulajdonos("Kormos Csanád");
        Szamla ujSzamla = new Szamla(ujTulajdonos);
        Kartya ujKartyaLetrehozas = new Kartya(ujTulajdonos, ujSzamla, kartyaSzam);
        return ujKartyaLetrehozas;
    }
}
