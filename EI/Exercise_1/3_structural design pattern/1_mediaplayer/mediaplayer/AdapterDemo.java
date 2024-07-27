package mediaplayer;

public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer player = new Mp3Player();
        player.play("mp3", "song.mp3");

        MediaPlayer adapter = new MediaAdapter("mp4");
        adapter.play("mp4", "video.mp4");

        adapter = new MediaAdapter("vlc");
        adapter.play("vlc", "movie.vlc");
    }
}
