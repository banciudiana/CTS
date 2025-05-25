package Proxy.agentie.clase;

public class Proxy implements IPachetTuristic{
    private PachetTuristicConcret pachetTuristicConcret;

    public Proxy(PachetTuristicConcret pachetTuristicConcret) {
        this.pachetTuristicConcret = pachetTuristicConcret;
    }

    public Proxy(Persoana persoana){
        this.pachetTuristicConcret=new PachetTuristicConcret(persoana);
    }


    @Override
    public void descriere() {
        pachetTuristicConcret.descriere();
    }

    @Override
    public void rezervaPachet() {
            if(this.pachetTuristicConcret.getPersoana().getVarsta()>=65){
                pachetTuristicConcret.rezervaPachet();
            }
            else{
                System.out.println("persoana este prea tanara ptr a rezerva pachetul acesta");
            }
    }
}
