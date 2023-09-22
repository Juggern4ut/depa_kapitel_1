package Kapitel1.Simuduck.BehaviourClasses;

import Kapitel1.Simuduck.BehaviourInterfaces.FlyBehaviour;

public class FlyNotPossible implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Cannot fly using the behaviour class FlyNotPossible.");
    }

}
