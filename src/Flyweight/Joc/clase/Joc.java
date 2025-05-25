package Flyweight.Joc.clase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Joc {

    private int nrPuncte=0;
    private Map<Integer, Set<Integer>> mapa=new HashMap<>();


    public void adaugaElement(TipElement tipElement, int x, int y){
        FlyweightFactory.getElement(tipElement).desenare(x,y);
        if(!mapa.containsKey(x))
        {
            Set<Integer> newHashSet=new HashSet<>();
            newHashSet.add(y);
            mapa.put(x,newHashSet);
        }
        else {
            mapa.get(x).add(y);
        }
    }

    public void lanseazaBullet(int x){
        nrPuncte+=mapa.get(x).size();
    }

    public  void afiseazaCanvas(){
        System.out.println("Pozitii elemente canvas");
        for (int x: mapa.keySet()){
            System.out.println("\n");
            System.out.println(x + ": ");
            for (int y: mapa.get(x)){
                System.out.println(y + ",");
            }
        }
    }

    public int getNrPuncte(){
        return nrPuncte;
    }

    public Joc setNrPuncte(int nrPuncte){
        this.nrPuncte=nrPuncte;
        return this;
    }

}
