package Kapitel1.Simuduck;

import Kapitel1.Simuduck.BehaviourClasses.FlyNotPossible;
import Kapitel1.Simuduck.BehaviourClasses.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNotPossible();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("display() from class ModelDuck");
    }

}
