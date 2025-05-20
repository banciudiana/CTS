package Facade.AgentieTurism.program;

import Facade.AgentieTurism.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.rezervaPachetCAzareTransport("Paris", "Milano");

    }
}
