package Template.agentie.clase;

public abstract class APachetTuristic {
    protected int codPachet;

    public APachetTuristic(int codPachet) {
        super();
        this.codPachet = codPachet;
    }

    public abstract void cautareCazare(int codPachet);
    public abstract void cautareTransport(int codPachet);
    public abstract void rezervaPachet(int codPachet);
    public abstract void platirePachet(int codPachet);

    public final void vindePachet(){
        cautareCazare(codPachet);
        cautareTransport(codPachet);
        rezervaPachet(codPachet);
        platirePachet(codPachet);
    }
}
