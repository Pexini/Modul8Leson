package ExtendsTask;

public class Dog extends Pets {
    @Override
    public void TypeAnimal() {
        System.out.println("Dog");
        ;
    }

    @Override
    public void Voice() {
        System.out.println("Gav-gav");
    }

    @Override
    public void Eat() {
        System.out.println("Thanks for sweet bone");
    }
}
