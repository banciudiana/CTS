package Proxy.Pestera.program;

import Proxy.Pestera.clase.IPestera;
import Proxy.Pestera.clase.Pestera;
import Proxy.Pestera.clase.ProxyPrestera;

public class Main {
    public static void main(String[] args) {
        IPestera pestera = new Pestera();
        pestera.vizitare("Gigel");
        pestera.vizitare("Gigica");
        pestera.vizitare("Gigi");
        System.out.println("Numar vizitatori all time: " + pestera.getNrVizitatori());

        IPestera pesteraPorxy = new ProxyPrestera((Pestera) pestera);
        pesteraPorxy.vizitare("Gigel");
        pesteraPorxy.vizitare("Gigica");
        pesteraPorxy.vizitare("Gigi");
        pesteraPorxy.vizitare("Gigi Duru");
        pesteraPorxy.vizitare("Georgel");
        pesteraPorxy.vizitare("Ionica");
    }
}
