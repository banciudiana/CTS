package Adapter.Firme.program;

import Adapter.Firme.clase.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ICalculReducereEmag calculReducereEmag=new CalculReducereEmag();
        Client clientEmag=new Client("Ana",2000);
        System.out.println(calculReducereEmag.getReducere(clientEmag));

        IEvaluareClient calculXYZ=new CalculReducereXYZ();
        System.out.println(calculXYZ.acordaDiscount(299));

        IEvaluareClient evaluareClient=new AdapterXYZEmag();
        System.out.println(evaluareClient.acordaDiscount(1000));
    }
}