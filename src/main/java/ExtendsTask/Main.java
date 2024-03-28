package ExtendsTask;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

        cat.TypeAnimal();
        cat.Voice();
        cat.Eat();
        System.out.println();
        dog.TypeAnimal();
        dog.Voice();
        dog.Eat();
        System.out.println();
        bird.TypeAnimal();
        bird.Voice();
        bird.Eat();


    }
}
