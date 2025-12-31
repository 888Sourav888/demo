package LLD.StructuralPatterns.FlyWeightPattern;

public class CharacterGlyph implements CharacterFlyWeight {
    private char character ; 
    private int fontSize ;
    private String fontFamily ;
    private String color ;
    private String fontWeight ;

    public CharacterGlyph( char character, int fontSize, String fontFamily, String color, String fontWeight){
        this.character = character ; 
        this.fontSize = fontSize ;
        this.fontFamily = fontFamily ;
        this.color = color ;
        this.fontWeight = fontWeight ;
    }

    @Override
    public void draw(){
        System.out.println("Drawing character: " + character + " with font size: " + fontSize + ", font family: " + fontFamily + ", color: " + color + ", font weight: " + fontWeight) ; 
    }
    
}
