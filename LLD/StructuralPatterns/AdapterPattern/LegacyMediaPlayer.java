package LLD.StructuralPatterns.AdapterPattern;

public class LegacyMediaPlayer {
    String mediaString ;
    public LegacyMediaPlayer(String mediaString){
        this.mediaString = mediaString ; 
    } 
    public void play(){
        System.out.println("Playing media string: "+mediaString);   
    }

}
