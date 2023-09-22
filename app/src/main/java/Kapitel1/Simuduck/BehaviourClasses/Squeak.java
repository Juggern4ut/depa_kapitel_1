package Kapitel1.Simuduck.BehaviourClasses;

import Kapitel1.Simuduck.BehaviourInterfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak, squeak. (Called by the calss Squeak)");
    }
}
