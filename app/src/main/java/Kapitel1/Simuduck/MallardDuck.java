package Kapitel1.Simuduck;

import Kapitel1.Simuduck.BehaviourClasses.FlyWithWings;
import Kapitel1.Simuduck.BehaviourClasses.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display() by class MallardDuck");
    }
}
