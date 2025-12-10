package test.strategy;

import strategy.Duck;
import strategy.MallardDuck;
import strategy.ModelDuck;
import strategy.implementation.FlyRocketPowered;

import java.io.*;
public class MiniDuckSimulator {
    public static void main(String[] args) throws IOException{
        Duck mallard = new MallardDuck();
        mallard.display();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
