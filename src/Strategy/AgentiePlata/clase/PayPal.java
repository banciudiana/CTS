package Strategy.AgentiePlata.clase;

public class PayPal implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println("Clientul " + numeClient + " plateste prin paypal suma de " +sumaPlata);
    }
}
