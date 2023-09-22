package Kapitel1.Simuduck.BehaviourClasses;

import Kapitel1.Simuduck.BehaviourInterfaces.QuackBehaviour;

public class Quack implements QuackBehaviour{
    public void quack(){
        System.out.println("Quack quack (called by the class Quack)");
    }
}
