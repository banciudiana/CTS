package Decorator.Pizza.program;

import Decorator.Pizza.clase.*;

public class Main {
    public static void main(String[] args) {
        // inainte
        IPizza pizzaFaraDec=new Pizza();
        System.out.println(pizzaFaraDec.getComponente());
        System.out.println(pizzaFaraDec.getPret());

        //dupa
        APizzaDecorator pizzaDecorabila=new DecoratorCrown(pizzaFaraDec);
        System.out.println(pizzaDecorabila.getComponente());
        System.out.println(pizzaDecorabila.getPret());

        APizzaDecorator pizzaDecorataMultipla=new DecoratorCrown( new DecoratorPicant(new Pizza(),20));
        System.out.println(pizzaDecorataMultipla.getComponente());
        System.out.println(pizzaDecorataMultipla.getPret());

    }
}
