package InterfaceLeson;

public class YouTubeService implements VideoServer, Monetization{
    @Override
    public void load(){
        System.out.println("Video загружено в YouTube");
    }
    @Override
    public void download(){
        System.out.println("Video скачено из YouTube");
    }
    @Override
    public void getMoney(){
        System.out.println("Получили деньги с YouTube");
    }
}
