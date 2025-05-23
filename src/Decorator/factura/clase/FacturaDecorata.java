package Decorator.factura.clase;


public class FacturaDecorata extends ADecorator {


    public FacturaDecorata(Factura factura) {
        super(factura);
    }

    @Override
    public void aplicaDiscount(int procent) {
        super.factura.setSumaFactura(factura.getSumaFactura() * (1- (double) procent /100));
        System.out.println(" Felicitari ai un discount de " + procent +"%" + " acum suma ta este de " + super.factura.getSumaFactura());
    }
}
