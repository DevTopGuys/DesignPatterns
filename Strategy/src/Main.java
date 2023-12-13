public class Main extends Duck {

    public Main() {
        quackingInterface = new Quack();
        flyingInterface = new IAmFlyingIHaveWings();
    }
    public static void main(String[] args) {
          Main m = new Main();
          m.doFly();
          m.doQuack();
          m.swim();

          m.setQuack(new DoNotQuack());
          m.setFly(new DoNotFly());
          m.doFly();
          m.doQuack();
    }
}

