import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MediaPlayer {
    public static void main(String[] args) {
        //become song and video when program actually runs, just recgonized as playable at compile time
        Playable song = new Song("Shape of You", "Ed Sheeran");
        Playable video = new Video();

        song.play();
        song.stop();

        video.play();
        video.stop();
        Playable[] playlist = new Playable[2];
        for(Playable p : playlist)
        {
            p.play();
            p.stop();
        }

        //List is an interface
        //can then create an array list or stack and more
        //use different functions on all types of lists as abstraction
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new Stack<>();
        List<Playable> list3 = new ArrayList<>();
    }
}
