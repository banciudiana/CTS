package Strategy.Meniu.clase;

import java.util.List;

public class StrategieCarboMin implements IProcesabil{
    @Override
    public OfertaMeniu alegeMeniuOptim(List<OfertaMeniu> meniuriDisponibile) {
        OfertaMeniu ofertaMeniuBun=meniuriDisponibile.get(0);
        for(OfertaMeniu ofertaMeniu:meniuriDisponibile){
            if(ofertaMeniu.getNrCarbohidrati()<ofertaMeniuBun.getNrCarbohidrati()){
                ofertaMeniuBun=ofertaMeniu;
            }
        }

        return ofertaMeniuBun;
    }
}
