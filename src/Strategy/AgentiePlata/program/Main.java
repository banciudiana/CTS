package Strategy.AgentiePlata.program;

import Strategy.AgentiePlata.clase.Card;
import Strategy.AgentiePlata.clase.Client;
import Strategy.AgentiePlata.clase.PayPal;

public class Main {
    public static void main(String[] args) {
        Client cl = new Client("Ion");

        cl.plateste(200);
        cl.setModPlata(new PayPal());
        cl.plateste(300);
        cl.setModPlata(new Card());
        cl.plateste(20);
    }
}
