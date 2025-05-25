package Template.agentie.program;

import Template.agentie.clase.APachetTuristic;
import Template.agentie.clase.PachetCazare;
import Template.agentie.clase.PachetTransport;

public class Main {
    public static void main(String[] args) {
        APachetTuristic pachetCazare=new PachetCazare(5);

        pachetCazare.vindePachet();

        APachetTuristic pachetTransport=new PachetTransport(6);
        pachetTransport.vindePachet();
    }
}
