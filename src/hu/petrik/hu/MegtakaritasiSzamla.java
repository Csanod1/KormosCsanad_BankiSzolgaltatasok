package hu.petrik.hu;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    public double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.alapKamat = 1.1;
    }
    public double getKamat(){
        return this.kamat;
    }
    public void setKamat(double kamat){
        this.kamat = kamat;
    }
    public boolean kivesz(int osszeg){
        if (super.getAktualisEgyenleg() - osszeg > 0){
            super.kivesz(osszeg);
            return true;
        }
        return false;
    }
    public void kamatJovairas(){
        super.aktualisEgyenleg *= kamat;
    }
}
