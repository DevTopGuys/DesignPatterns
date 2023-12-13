public class DoNotQuack implements QuackingInterface{
    @Override
    public void quack() {
        System.out.println("SILENT");
    }
}
