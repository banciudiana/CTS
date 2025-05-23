package Decorator.factura.program;

import Decorator.factura.clase.ADecorator;
import Decorator.factura.clase.Factura;
import Decorator.factura.clase.FacturaDecorata;
import Decorator.factura.clase.IFactura;

public class Main {

    public static void main(String[] args) {
        // fara decorator

        Factura iFactura=new Factura(123, 200);
        iFactura.printeazaFactura();

        ADecorator facturaDecorata=new FacturaDecorata(iFactura);

        facturaDecorata.aplicaDiscount(20);
        facturaDecorata.printeazaFactura();

    }
}
