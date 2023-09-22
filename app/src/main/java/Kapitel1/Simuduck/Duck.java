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

    public abstract void display();
}
