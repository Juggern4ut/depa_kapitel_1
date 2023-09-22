package Kapitel1.Simuduck;

import Kapitel1.Simuduck.BehaviourInterfaces.FlyBehaviour;
import Kapitel1.Simuduck.BehaviourInterfaces.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("swim() by class Duck");
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public abstract void display();
}
