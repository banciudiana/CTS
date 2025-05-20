package Adapter.Firme.clase;

public class CalculReducereXYZ implements IEvaluareClient{
    @Override
    public double acordaDiscount(double suma) {
        if( suma>200){
            return 0.25;
        }
        else return 0;
    }
}
