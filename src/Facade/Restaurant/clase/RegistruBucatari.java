package Facade.Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class RegistruBucatari {
    private List<Bucatar> listaBucatari=new ArrayList<>();

    public void addBucatar(Bucatar bucatar){
        listaBucatari.add(bucatar);
    }

    public int getNrBucatariDisponibili(String data){
        int k=0;
        for (Bucatar b: listaBucatari) {
            if(!b.isEsteOcupat()){
                k++;
            }
        }
        return k;
    }
}
