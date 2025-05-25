package Chain.Banca;

public class VerificareSalariu extends AHandler{
    @Override
    public boolean verificareConditiiCreditare(Client client) {
       if(client.getSalariu()>=5000){
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
