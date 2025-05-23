package Decorator.agentie.program;

import Decorator.agentie.clase.AOfertaPachetTuristic;
import Decorator.agentie.clase.IPachetTuristic;
import Decorator.agentie.clase.OfertaPachetCazare;
import Decorator.agentie.clase.PachetCazare;

public class Main {
    public static void main(String[] args) {
        IPachetTuristic pachetTuristic=new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("Acest pachet nu poate fi anulat");

        AOfertaPachetTuristic pachetTuristic1=new OfertaPachetCazare(pachetTuristic);
        pachetTuristic.descriere();
        System.out.println("Acest pachet poate fi anulat");
        pachetTuristic1.anulareRezervare();
    }
}
