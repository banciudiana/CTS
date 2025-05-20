package Adapter.Firme.clase;

public class CalculReducereEmag implements  ICalculReducereEmag{
    @Override
    public double getReducere(Client client) {
        System.out.println("Evaluare discount de catre Emag");
        if( client.getTotalAchizitie()>1000)
        {
            return 0.2;
        }
        else
            return 0.1;
    }
}
