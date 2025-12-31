package LLD.StructuralPatterns.AdapterPattern;

public class MediaPlayerAdapter implements MediaPlayer {
    public String[] mediachunks ; 
    public MediaPlayerAdapter(String[] mediachunks){
        this.mediachunks = mediachunks ; 
    }
    @Override
    public void playMediaChunks() {

        for(int i = 0 ; i < mediachunks.length ; i++){
            LegacyMediaPlayer legacyPlayer = new LegacyMediaPlayer(mediachunks[i]);
            legacyPlayer.play();
        }
        
    }
}
