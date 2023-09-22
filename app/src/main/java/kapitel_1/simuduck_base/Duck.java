package kapitel_1.simuduck_base;

public abstract class Duck {
    public void quack() {
        System.out.println("quack() by class Duck");
    }

    public void swim() {
        System.out.println("swim() by class Duck");
    }

    public abstract void display();
}
