package Facade.AgentieTurism.clase;

public class Facade {
    public void rezervaPachetCAzareTransport (String orasPlecare, String orasDestinatie)
    {
        CompanieAeriana companieAeriana=new CompanieAeriana("WizzAir");
        Zbor zborDus=companieAeriana.rezervaBiletAvion(orasPlecare,orasDestinatie);
        Zbor zborIntors=companieAeriana.rezervaBiletAvion(orasDestinatie,orasPlecare);
        Hotel hotel=new Hotel("Novotel");
        hotel.rezervaCamera(orasDestinatie);
        System.out.println("Zbor dus: " + zborDus);
        System.out.println("Zbsor Intors: "+ zborIntors);

    }
}
