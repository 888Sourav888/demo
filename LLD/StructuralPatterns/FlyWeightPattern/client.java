package LLD.StructuralPatterns.FlyWeightPattern;

public class client {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        CharacterFlyWeight char1 = factory.getCharacterFlyWeight('A', 12, "Arial", "black", "normal");
        CharacterFlyWeight char2 = factory.getCharacterFlyWeight('B', 14, "Times New Roman", "red", "bold");
        char1.draw();
        char2.draw();
    }
}