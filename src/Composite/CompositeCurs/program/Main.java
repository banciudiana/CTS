package Composite.CompositeCurs.program;

import Composite.CompositeCurs.clase.Categorie;
import Composite.CompositeCurs.clase.IOptiune;
import Composite.CompositeCurs.clase.Item;

public class Main {
    public static void main(String[] args) {
        IOptiune cOptiune=new Categorie("File");
        IOptiune cOptiune1=new Categorie("Camere");
        IOptiune cOptiune2=new Categorie("Oferte");

        IOptiune iOpen=new Item("Open");
        IOptiune iSave=new Item("Save");
        IOptiune iClose=new Item("Close");
        IOptiune iEditare=new Item("editare");

        try{
            cOptiune1.adaugaNod(iOpen);
            cOptiune1.adaugaNod(iClose);

            cOptiune.adaugaNod(iSave);

            cOptiune2.adaugaNod(iEditare);

            cOptiune.descriere();
            cOptiune1.descriere();
            cOptiune2.descriere();

            cOptiune1.stergeNod(iClose);
            cOptiune1.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
