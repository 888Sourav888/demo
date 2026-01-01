package LLD.BehaviouralPatterns.IteratorPattern;

import LLD.BehaviouralPatterns.IteratorPattern.Iterable.Playlist;
import LLD.BehaviouralPatterns.IteratorPattern.Iterator.Iterator;

public class client {
    public static void main(String[] args) {
       Playlist playlist = new Playlist() ; 
       playlist.addSong("Song 1") ;
         playlist.addSong("Song 2") ;

        Iterator<String> iterable = playlist.createIterator() ; 

        while(iterable.hasNext()){
            System.out.println(iterable.next()) ; 
        }
    }
}
