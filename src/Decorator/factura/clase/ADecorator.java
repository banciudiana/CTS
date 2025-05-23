package Decorator.factura.clase;

public abstract class ADecorator implements IFactura{

    protected Factura factura;

    public ADecorator(Factura factura) {
        this.factura = factura;
    }

    @Override
    public void printeazaFactura() {
        factura.printeazaFactura();
        System.out.println("La multi ani");
    }

    public abstract void aplicaDiscount(int procent);
}
