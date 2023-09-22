package Kapitel1.Simuduck.BehaviourClasses;

import Kapitel1.Simuduck.BehaviourInterfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Fly with Rocketboost!");
    }

}
