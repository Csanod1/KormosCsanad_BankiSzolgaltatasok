package hu.petrik.hu;

public class HitelSzamla extends Szamla{
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret(){
        return this.hitelKeret;
    }
    public boolean kivesz(int osszeg){
        int minPenz =  - this.hitelKeret;
        if (minPenz <= super.aktualisEgyenleg - osszeg){
            super.kivesz(osszeg);
            return true;
        }
        System.out.println("Az összeg nem vonható le a számláról");
        return false;
    }
}
