package Proxy.agentie.program;

import Proxy.agentie.clase.PachetTuristicConcret;
import Proxy.agentie.clase.Persoana;
import Proxy.agentie.clase.Proxy;

public class Main {

    public static void main(String[] args) {
        Persoana p=new Persoana(68);
        Persoana p1=new Persoana(60);

        PachetTuristicConcret pachetTuristicConcret=new PachetTuristicConcret(p);
        PachetTuristicConcret pachetTuristicConcret1=new PachetTuristicConcret(p1);
        pachetTuristicConcret1.rezervaPachet();

        Proxy pachet=new Proxy(p);
        Proxy pachet1=new Proxy(p1);
        pachet.rezervaPachet();
        pachet1.rezervaPachet();
    }
}
