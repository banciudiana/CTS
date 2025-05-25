package Chain.Banca;

public class VerificareNumarPersoaneIntretinere extends AHandler{
    @Override
    public boolean verificareConditiiCreditare(Client client) {
        if(client.getNrPersoaneIntretinere()<=4){
            if(this.nextHandler!=null){
                return this.nextHandler.verificareConditiiCreditare(client);
            } else{
                return true;
            }

        } else {
            return false;
        }


    }
}
