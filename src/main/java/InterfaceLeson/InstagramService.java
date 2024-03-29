package InterfaceLeson;

public class InstagramService implements VideoServer{
    @Override
    public void load(){
        System.out.println("Video загружено в Instagram");
    }
    @Override
    public void download() {
        System.out.println("Video скачено из instagram");
    }
}
