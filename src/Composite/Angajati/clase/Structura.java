package Composite.Angajati.clase;

import java.util.ArrayList;
import java.util.List;

public class Structura implements INod{
    private List<INod> lista;
    private String numeDepartament;

    public Structura(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.lista=new ArrayList<>();
    }


    @Override
    public double getSalariu() {
        double salariuTotal=0.0;
        int nrAngajati=0;

        if(!lista.isEmpty()){
            for(INod nod:lista){
                if(nod instanceof Angajat){
                    salariuTotal+=nod.getSalariu();
                    nrAngajati++;
                } else{
                    salariuTotal+= nod.getSalariu() * nod.getNrAngajati();
                    nrAngajati+= nod.getNrAngajati();
                }
            }
            return salariuTotal/nrAngajati;
        }
        System.out.println("Nu avem inca angajati");
        return 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Departament" + numeDepartament);
        for (INod nod : lista)
        {
            nod.displayInfo();
        }
    }

    @Override
    public void addNod(INod nod) {
        if(nod!=null)
            lista.add(nod);
    }

    @Override
    public void stergeNod(INod nod) {
        if(nod!=null)
            lista.remove(nod);
    }

    @Override
    public INod getNod(int index) {
        if(index>=0 && index < lista.size()){
            return lista.get(index);
        }
        return null;
    }

    @Override
    public int getNrAngajati() {
        int nrAngajati=0;
        for (INod nod: lista)
        {
            if(nod instanceof Angajat){
                nrAngajati++;
            } else{
                nrAngajati+= nod.getNrAngajati();
            }
        }
        return nrAngajati;
    }
}
