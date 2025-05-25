package Template.agentie.clase;

public class PachetCazare extends APachetTuristic {

    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cautareCazare(int codPachet) {
        System.out.println("S a gasit cazare ptr " + codPachet);
    }

    @Override
    public void cautareTransport(int codPachet) {

    }

    @Override
    public void rezervaPachet(int codPachet) {
        System.out.println("S-a rezervat pachetul " + codPachet);
    }

    @Override
    public void platirePachet(int codPachet) {
        System.out.println("S-a platit pachetul " + codPachet);
    }
}
