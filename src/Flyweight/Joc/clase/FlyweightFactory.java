package Flyweight.Joc.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<TipElement, IElement> mapa =new HashMap<>();

    static{
        mapa.put(TipElement.SUBMARIN,new Element(TipElement.SUBMARIN,"bitmapSubmarin"));
        mapa.put(TipElement.BARCA,new Element(TipElement.BARCA,"bitmapbarca"));
        mapa.put(TipElement.NAVA,new Element(TipElement.NAVA,"bitmapNava"));
    }

    public static IElement getElement(TipElement tipElement){
        return mapa.get(tipElement);
    }

}
