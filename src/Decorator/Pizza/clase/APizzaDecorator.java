package Decorator.Pizza.clase;

public abstract class APizzaDecorator implements IPizza{

    protected  IPizza pizza;

    public APizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getComponente() {
        return pizza.getComponente();
    }

    @Override
    public int getPret() {
        return pizza.getPret();
    }
}
