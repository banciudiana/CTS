package Decorator.Pizza.clase;

public class Pizza implements IPizza{


    @Override
    public String getComponente() {
        return "blat, rosii, ciuperci";
    }

    @Override
    public int getPret() {
        return 27;
    }
}
