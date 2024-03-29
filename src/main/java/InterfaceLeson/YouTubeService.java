package InterfaceLeson;

public class YouTubeService implements VideoServer{
    @Override
    public void load(){
        System.out.println("Video загружено в YouTube");
    }
    @Override
    public void download(){
        System.out.println("Video скачено из YouTube");
    }
}
