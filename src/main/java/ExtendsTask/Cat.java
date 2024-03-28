package ExtendsTask;

public class Cat extends Pets{
    @Override
    public void TypeAnimal() {
        System.out.println("Кошка");
    }

    @Override
    public void Voice() {
        System.out.println("Myau");;
    }

    @Override
    public void Eat() {
        System.out.println("Опять этот сухой корм");
    }
}
