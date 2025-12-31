package LLD.StructuralPatterns.AdapterPattern;

public class client {
    public static void main(String[] args){
        String[] mediachunks = {"chunk1","chunk2","chunk3"};
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(mediachunks);
        mediaPlayer.playMediaChunks();
    }
}
