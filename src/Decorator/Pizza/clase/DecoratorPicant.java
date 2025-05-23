package Decorator.Pizza.clase;

public class DecoratorPicant extends APizzaDecorator{
    private int nivelIuteala;


    public DecoratorPicant(IPizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala=nivelIuteala;
    }

    @Override
    public String getComponente() {
        return super.getComponente() + " nivel iuteala " + nivelIuteala;
    }

    @Override
    public int getPret() {
        return super.getPret() + 7;
    }
}
