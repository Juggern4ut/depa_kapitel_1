package Kapitel1.Simuduck.BehaviourClasses;

import Kapitel1.Simuduck.BehaviourInterfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("... no sound (Called by the class MuteQuack)");
    }
}
