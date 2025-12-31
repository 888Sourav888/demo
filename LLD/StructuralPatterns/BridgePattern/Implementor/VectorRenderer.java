package LLD.StructuralPatterns.BridgePattern.Implementor;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Vectorizing circle with radius: " + radius);
    }

    @Override
    public void renderRectangle(float width, float height) {
        System.out.println("Vectorizing rectangle with width: " + width + " and height: " + height);
    }
}
