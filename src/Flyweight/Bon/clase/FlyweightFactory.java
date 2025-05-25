package Flyweight.Bon.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<ETipPrintare,IPrintare> mapa=new HashMap<>();
    private static int nrBonuri=0;

    public static IPrintare getMesajPrintare(ETipPrintare tipPrintare){

        nrBonuri++;
        IPrintare printare=mapa.get(tipPrintare);
        if(printare==null){
            printare= new MasajPrintare(tipPrintare);
            mapa.put(tipPrintare,printare);

        }
        return printare;
    }

    public static int getNrBonuri(){
        return nrBonuri;
    }

    public static int getNrMatriteBonuri(){
        return mapa.size();
    }

}
