package LLD.StructuralPatterns.BridgePattern.Implementor;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rasterizing circle with radius: " + radius);
    }

    @Override
    public void renderRectangle(float width, float height) {
        System.out.println("Rasterizing rectangle with width: " + width + " and height: " + height);
    }
    
}
