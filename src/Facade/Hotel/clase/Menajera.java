package Facade.Hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class Menajera {
    private List<Boolean> listaCamereCuratate;

    public Menajera(){
        listaCamereCuratate=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listaCamereCuratate.add(true);
        }
        for (int i = 6; i < 15; i++) {
            listaCamereCuratate.add(false);
        }
    }

    public boolean esteCameraCuratat(int cod){
        return listaCamereCuratate.get(cod);
    }

    public boolean areProsoapeNoi(int cod){
        return listaCamereCuratate.get(cod);
    }
}

