package ExtendsTask;

public class Bird extends Pets {
    @Override
    public void TypeAnimal() {
        System.out.println("Kanareika");
    }

    @Override
    public void Voice() {
        System.out.println("Chik-cherik");;
    }

    @Override
    public void Eat() {
        super.Eat();
    }
}
