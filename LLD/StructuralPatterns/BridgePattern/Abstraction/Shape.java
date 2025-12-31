package LLD.StructuralPatterns.BridgePattern.Abstraction;

import LLD.StructuralPatterns.BridgePattern.Implementor.Renderer;

public abstract class Shape {
    Renderer renderer;
    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
