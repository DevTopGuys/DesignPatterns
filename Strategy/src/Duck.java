public abstract class Duck {
    FlyingInterface flyingInterface;
    QuackingInterface quackingInterface;
    public void setQuack(QuackingInterface q){
        quackingInterface = q;
    }
    public void setFly(FlyingInterface f) {
        flyingInterface = flyingInterface;
    }
    public void doFly(){
        flyingInterface.fly();
    }
    public void doQuack(){
        quackingInterface.quack();
    }
    public void swim(){
        System.out.println("All ducks can swim");
    }
}


