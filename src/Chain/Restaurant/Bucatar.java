package Chain.Restaurant;

public class Bucatar extends AHandler {
    @Override
    public void procesareComanda(Comanda comanda) {
        if(comanda.getDificultateComanda()>5 && comanda.getDificultateComanda()<100){
            System.out.println("Comanda a fost procesata de catre bucatar");
        } else{
            System.out.println("Bucatarul nu a putut procesa comanda");
            if(this.getNextHandler()!=null){
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
