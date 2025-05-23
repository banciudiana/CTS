package Decorator.agentie.clase;

public abstract class AOfertaPachetTuristic implements IPachetTuristic{

    //base decorator
    private IPachetTuristic pachetTuristic;

    public AOfertaPachetTuristic(IPachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    public void descriere(){
        pachetTuristic.descriere();
    }

    public abstract void anulareRezervare();
}
