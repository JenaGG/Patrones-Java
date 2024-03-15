public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}