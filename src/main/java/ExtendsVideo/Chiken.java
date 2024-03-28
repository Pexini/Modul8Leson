package ExtendsVideo;

public class Chiken extends Bird{
    @Override
    public void makeSomeNoise() {
        System.out.println("Ку-ка-ре-ку");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void ILive() {
        super.ILive();
    }
}
