package Chain.Restaurant;

public class Ospatar extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        if(comanda.getDificultateComanda()<=5){
            System.out.println(" COMANDA A FOST PROCESATA DE CATRE OSPATAR");

        } else {
            System.out.println("Comanda nu a putut fi procesata de ctare ospatar");
            if(this.getNextHandler()!=null){
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
