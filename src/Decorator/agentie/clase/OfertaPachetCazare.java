package Decorator.agentie.clase;

public class OfertaPachetCazare extends AOfertaPachetTuristic{
    @Override
    public void anulareRezervare() {
        System.out.println("rezervarea a fost anulata");
    }
    //concrete decorator

    public OfertaPachetCazare(IPachetTuristic pachetTuristic){
        super(pachetTuristic);
    }
}
