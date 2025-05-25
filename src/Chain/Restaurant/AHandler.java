package Chain.Restaurant;

public abstract class AHandler {
    private AHandler nextHandler;

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void procesareComanda(Comanda comanda);
}
