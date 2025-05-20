package Adapter.LogiTrans.clase;

public class Adapter implements IRutaStandard{
    private IGlobalShip globalShip;

    public Adapter(){
        this.globalShip=new GlobalShip();
    }

    @Override
    public Ruta getRutaStandard(Client client) {
        String adresa= client.getAdresa();
        boolean isFast=client.getTipLivrare()== TipLivrare.CURIER;
        int greutate= client.getGreutateColet();
        RouteDetails rutaDetalii= globalShip.getRouteDetailsGlobalShip(adresa,isFast,greutate);
        return new Ruta(rutaDetalii.getKm(), 1, rutaDetalii.getTotal());
    }
}
