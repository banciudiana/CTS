package Chain.Restaurant;

public class Main {
    public static void main(String[] args) {
        AHandler handlerOspatar=new Ospatar();
        AHandler handlerBucatar=new Bucatar();
        AHandler handlerBucatarSef=new BucatarSef();

        Comanda comanda=new Comanda(20,"bananae",3);
        Comanda comanda1=new Comanda(150,"bavc",5);
        Comanda comanda2=new Comanda(2,"ab",20);

        handlerOspatar.setNextHandler(handlerBucatar);
        handlerBucatar.setNextHandler(handlerBucatarSef);

        handlerOspatar.procesareComanda(comanda);
        handlerOspatar.procesareComanda(comanda1);
        handlerOspatar.procesareComanda(comanda2);
    }
}
