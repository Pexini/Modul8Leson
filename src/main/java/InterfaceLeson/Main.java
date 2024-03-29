package InterfaceLeson;

public class Main {
    public static void main(String[] args) {
        InstagramService ins = new InstagramService();
        YouTubeService you = new YouTubeService();

        ins.load();
        ins.download();
        System.out.println();
        you.load();
        you.download();

    }
}
