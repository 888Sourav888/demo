package LLD.StructuralPatterns.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    Map<Character, CharacterFlyWeight> flyWeightMap = new HashMap<>();

    public CharacterFlyWeight getCharacterFlyWeight( char character, int fontSize, String fontFamily, String color, String fontWeight){
        if( flyWeightMap.containsKey(character)){
            return flyWeightMap.get(character) ; 
        } else {
            CharacterFlyWeight characterFlyWeight = new CharacterGlyph(character, fontSize, fontFamily, color, fontWeight) ; 
            flyWeightMap.put(character, characterFlyWeight) ; 
            return characterFlyWeight ; 
        }
    }
}
