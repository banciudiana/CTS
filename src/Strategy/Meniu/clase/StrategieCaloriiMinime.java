package Strategy.Meniu.clase;

import java.util.List;

public class StrategieCaloriiMinime implements IProcesabil{

    @Override
    public OfertaMeniu alegeMeniuOptim(List<OfertaMeniu> meniuriDisponibile) {
        OfertaMeniu ofertaMeniuBun=meniuriDisponibile.get(0);
        for(OfertaMeniu ofertaMeniu:meniuriDisponibile){
            if(ofertaMeniu.getNrCalorii()<ofertaMeniuBun.getNrCalorii()){
                ofertaMeniuBun=ofertaMeniu;
            }
        }

        return ofertaMeniuBun;
    }
}
