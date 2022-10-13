package hu.petrik.hu;

import java.util.List;

public class Bank {
    private List<Szamla> List;

    public Bank(java.util.List<Szamla> list) {
        List = list;
    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        Szamla ujSzamla = new Szamla(tulajdonos);
        if (hitelKeret < 0){
            HitelSzamla ujHitelSzamla = new HitelSzamla(tulajdonos, hitelKeret);
        }else {
            MegtakaritasiSzamla ujMegtakaritasiSzamla = new MegtakaritasiSzamla(tulajdonos);
        }
        return ujSzamla;
    }
    public int getÖsszegyenleg(Tulajdonos tulajdonos){
        Szamla ujSzamla = new Szamla(tulajdonos);
        int legnagyobb = List.indexOf(tulajdonos);
        for (int i = 0; i < List.size(); i++) {

        }
        return ujSzamla.aktualisEgyenleg;
    }

}
