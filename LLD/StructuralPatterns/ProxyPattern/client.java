package LLD.StructuralPatterns.ProxyPattern;

public class client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display();
        image.getFileName();
        image.display();
    }
}
