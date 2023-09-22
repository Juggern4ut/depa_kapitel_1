package Kapitel1.Simuduck;

import Kapitel1.Simuduck.BehaviourClasses.FlyNotPossible;
import Kapitel1.Simuduck.BehaviourClasses.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNotPossible();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("display() by class RubberDuck");
    }
}
