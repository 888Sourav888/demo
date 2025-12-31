package LLD.StructuralPatterns.BridgePattern.Abstraction;

import LLD.StructuralPatterns.BridgePattern.Implementor.Renderer;

public class Circle extends Shape {
    private float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
    
}
