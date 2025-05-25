package Chain.Banca;

import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) {


        AHandler hanler1=new VerificareDatorii();
        AHandler handler2=new VerificareNumarPersoaneIntretinere();
        AHandler handler3=new VerificareSalariu();

        hanler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Client client=new Client("Ion", 6000.00, Boolean.FALSE, 4);
        if(hanler1.verificareConditiiCreditare(client)){
            System.out.println("Poate face creditul");
        } else {
            System.out.println(" nu poate");
        }
    }
}
