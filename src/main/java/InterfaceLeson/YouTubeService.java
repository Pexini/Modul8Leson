package InterfaceLeson;

public class YouTubeService implements VideoServer{
    public void load(){
        System.out.println("Video загружено в YouTube");
    }
    public void download(){
        System.out.println("Video скачено из YouTube");
    }
}
