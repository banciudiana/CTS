package Composite.Angajati.program;

import Composite.Angajati.clase.Angajat;
import Composite.Angajati.clase.INod;
import Composite.Angajati.clase.Structura;

public class Main {
    public static void main(String[] args) {
        INod manager1=new Structura(" Achizitii");
        INod manager2=new Structura( " IT");
        INod manager3= new Structura( " IT mentenanta ");

        INod angajat1= new Angajat("Ion" , 3000.0);
        INod angajat2= new Angajat("Ion" , 4000.0);
        INod angajat3= new Angajat("Maria", 5000.0);
        INod angajat4=new Angajat("Florin",1000.0);

        manager1.addNod(angajat1);
        manager1.addNod(angajat2);
        manager1.addNod(manager2);
        manager2.addNod(angajat3);
        manager3.addNod(angajat4);
        manager2.addNod(manager3);

        manager1.displayInfo();
        System.out.println("Salariu mediu companie " + manager1.getSalariu() + " si are " + manager1.getNrAngajati() + " angajati");

    }
}
