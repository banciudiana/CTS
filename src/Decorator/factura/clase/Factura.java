package Decorator.factura.clase;

public class Factura implements IFactura{

    private int codFactura;
    private double sumaFactura;

    public Factura(int codFactura, double sumaFactura) {
        this.codFactura = codFactura;
        this.sumaFactura = sumaFactura;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public double getSumaFactura() {
        return sumaFactura;
    }

    public void setSumaFactura(double sumaFactura) {
        this.sumaFactura = sumaFactura;
    }

    @Override
    public void printeazaFactura() {
        System.out.println(" Cod ul facturii este " + codFactura +"\n Suma este de " + sumaFactura);
    }
}
