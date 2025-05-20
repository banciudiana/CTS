package Adapter.LogiTrans.clase;

public class GlobalShip implements IGlobalShip{
    @Override
    public RouteDetails getRouteDetailsGlobalShip(String adresa, boolean isFast, double greutate) {
        int total=0;
        if(isFast)
        {
            total =10;
        } else total=5;
        if(greutate>10)
        {
            total+=10;
        }
        return new RouteDetails(200,total);
    }
}
