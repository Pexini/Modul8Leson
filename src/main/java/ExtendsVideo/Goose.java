package ExtendsVideo;

public class Goose extends Bird{
    @Override
    public void makeSomeNoise() {
        System.out.println("Ga-ga-ga");
    }

    @Override
    public void fly() {
        super.fly();
    }
    public void IlikeToEat(){
        System.out.println("Grass");
    }

    @Override
    public void ILive() {
        System.out.println("in the lake");
    }
}
