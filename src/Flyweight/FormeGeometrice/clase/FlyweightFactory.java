package Flyweight.FormeGeometrice.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, FormaGeometrica> formaGeometricaMap=new HashMap<>();

    static{

        formaGeometricaMap.put("cerc", new FormaGeometrica("cerc", "det cerc"));
        formaGeometricaMap.put("triunghi ", new FormaGeometrica(" triunghi ", "det cerc"));
        formaGeometricaMap.put("patrat",new FormaGeometrica("patrat,","det patrat"));
    }

    public static FormaGeometrica getFlyweight(String cheie){
        if(!formaGeometricaMap.containsKey(cheie)){
            formaGeometricaMap.put(cheie, new FormaGeometrica("orice","det poav"));

        }
        return formaGeometricaMap.get(cheie);
    }
}
