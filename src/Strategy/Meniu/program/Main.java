package Strategy.Meniu.program;

import Strategy.Meniu.clase.MeniuRestaurant;
import Strategy.Meniu.clase.OfertaMeniu;
import Strategy.Meniu.clase.StrategieCaloriiMinime;
import Strategy.Meniu.clase.StrategieCarboMin;

public class Main {
    public static void main(String[] args) {
        MeniuRestaurant meniuRestaurant = new MeniuRestaurant();

        //adaugare meniuri in meniu restaurant
        OfertaMeniu meniu1 = new OfertaMeniu("Meniu1", 750, 70);
        OfertaMeniu meniu2 = new OfertaMeniu("Meniu2", 500, 80);
        OfertaMeniu meniu3 = new OfertaMeniu("Meniu3", 650, 20);
        OfertaMeniu meniu4 = new OfertaMeniu("Meniu4", 800, 90);

        meniuRestaurant.addOfertaMeniu(meniu1);
        meniuRestaurant.addOfertaMeniu(meniu2);
        meniuRestaurant.addOfertaMeniu(meniu3);
        meniuRestaurant.addOfertaMeniu(meniu4);

        meniuRestaurant.setStrategieAlegere(new StrategieCaloriiMinime());
        meniuRestaurant.alegereOferta();

        System.out.println("Meniu cu minim calorii " + meniuRestaurant.alegereOferta());
        meniuRestaurant.setStrategieAlegere(new StrategieCarboMin());
        System.out.println("Meniu cu minim carbohidrati " + meniuRestaurant.alegereOferta());
    }
}
