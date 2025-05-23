package Composite.Colet.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite implements INod{
    //composite\
    private List<INod> lista;
    private float greutate;

    public Composite(float greutate) {
        this.greutate = greutate;
        lista=new ArrayList<>();
    }


    @Override
    public float getGreutate() {
        float totalGreutate=0;
        for(INod nod: lista){
            totalGreutate+=nod.getGreutate();
        }
        totalGreutate+=this.greutate;
        return totalGreutate;
    }

    @Override
    public boolean isFragil() {
       for(INod nod:lista){
           if(nod.isFragil())
           {
               return true;
           }
       }
       return false;
    }

    @Override
    public void adaugaNod(INod nod) {
        if(nod!=null){
            lista.add(nod);
        }
    }

    @Override
    public void stergeNod(INod nod) {
        if(nod !=null)
            lista.remove(nod);

    }

    @Override
    public INod getNod(int index) {
        if(index<lista.size() && index>=0){
            return lista.get(index);
        } else{
            return null;
        }
    }
}
