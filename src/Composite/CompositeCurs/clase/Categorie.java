package Composite.CompositeCurs.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IOptiune{


    // composite
    private List<IOptiune> lista;
    private String nume;

    public Categorie(String nume) {
        this.lista=new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        this.lista.remove(optiune);
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        this.lista.add(optiune);
    }

    @Override
    public IOptiune getNod(int index) throws Exception {
        return this.lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + nume);
        for(IOptiune optiune: lista)
        {
            optiune.descriere();
        }
    }
}
