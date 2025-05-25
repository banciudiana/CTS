package Flyweight.FormeGeometrice.program;

import Flyweight.FormeGeometrice.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory.getFlyweight("patrat").desenare(10,10);
        FlyweightFactory.getFlyweight("triunghi").desenare(15,15);
        FlyweightFactory.getFlyweight("cerc").desenare(20,20);
    }
}
