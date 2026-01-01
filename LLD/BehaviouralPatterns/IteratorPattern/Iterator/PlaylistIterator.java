package LLD.BehaviouralPatterns.IteratorPattern.Iterator;

import LLD.BehaviouralPatterns.IteratorPattern.Iterable.Playlist;

public class PlaylistIterator implements Iterator<String> {

    private final Playlist playlist;
    int index = 0 ; 

    public PlaylistIterator(Playlist playlist){
        this.playlist = playlist ; 
    }

    @Override
    public boolean hasNext(){
        return index < playlist.getSize() ; 
    }

    @Override
    public String next(){
        return playlist.getSong(index++) ;
    }


    
}
