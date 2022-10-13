package hu.petrik.hu;

public class Tulajdonos {
    private String nev;

    public Tulajdonos(String nev) {
        this.nev = nev;
    }
    public String getNev(){
        return String.format(this.nev);
    }
    public void setNev(String nev){
        this.nev = nev;
    }
}
