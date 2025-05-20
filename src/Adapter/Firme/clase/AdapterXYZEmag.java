package Adapter.Firme.clase;

public class AdapterXYZEmag  implements IEvaluareClient{
    private CalculReducereEmag calculReducereEmag;

    public AdapterXYZEmag(){
        this.calculReducereEmag=new CalculReducereEmag();
    }

    @Override
    public double acordaDiscount(double suma) {
        System.out.println("Se pare ca calculeaza XYZ dar ...");
        return calculReducereEmag.getReducere(new Client("Mara",suma));
    }
}
