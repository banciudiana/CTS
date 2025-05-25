package Template.agentie.clase;

public class PachetTransport extends APachetTuristic{
    public PachetTransport(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cautareCazare(int codPachet) {

    }

    @Override
    public void cautareTransport(int codPachet) {
        System.out.println("S a gasit transport ptr " + codPachet);
    }

    @Override
    public void rezervaPachet(int codPachet) {
        System.out.println("s a xrezervat " + codPachet);

    }

    @Override
    public void platirePachet(int codPachet) {
        System.out.println("s a platit ");

    }
}
