package Kapitel1.Simuduck.BehaviourClasses;

import Kapitel1.Simuduck.BehaviourInterfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Fly with wings using the behaviour class FlyWithWings.");
    }

}
