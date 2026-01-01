package LLD.BehaviouralPatterns.IteratorPattern.Iterable;

import LLD.BehaviouralPatterns.IteratorPattern.Iterator.Iterator;
import LLD.BehaviouralPatterns.IteratorPattern.Iterator.PlaylistIterator;
import java.util.* ; 

public class Playlist implements Iterable<String> {

    List<String> songs;  

    public Playlist(){
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public String getSong(int index){
        return songs.get(index);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }   

    public int getSize() {
        return songs.size();
    }   


    @Override
    public Iterator<String> createIterator() {
        return new PlaylistIterator(this);
    }
    
}
