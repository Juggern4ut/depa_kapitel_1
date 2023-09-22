package Kapitel1.Simuduck;

import Kapitel1.Simuduck.BehaviourClasses.FlyWithWings;
import Kapitel1.Simuduck.BehaviourClasses.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display() by class RedheadDuck");
    }
}
