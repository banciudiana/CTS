package Proxy.agentie.clase;

public class PachetTuristicConcret implements IPachetTuristic {

    private Persoana persoana;

    public PachetTuristicConcret(Persoana persoana) {
        this.persoana = persoana;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar transport");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S a rezervat pachetul ptr persoana care are varsta de: " + persoana.getVarsta());

    }
}
