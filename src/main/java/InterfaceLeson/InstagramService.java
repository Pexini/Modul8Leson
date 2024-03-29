package InterfaceLeson;

public class InstagramService implements VideoServer{
    public void load(){
        System.out.println("Video загружено в Instagram");
    }
    public void download() {
        System.out.println("Video скачено из instagram");
    }
}
