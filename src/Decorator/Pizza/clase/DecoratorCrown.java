package Decorator.Pizza.clase;

public class DecoratorCrown extends APizzaDecorator{

    public DecoratorCrown(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponente() {
        return super.getComponente() + " are blat crown";
    }

    @Override
    public int getPret() {
        return super.getPret() + 10;
    }
}
