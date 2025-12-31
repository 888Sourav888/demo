package LLD.StructuralPatterns.BridgePattern;

import LLD.StructuralPatterns.BridgePattern.Abstraction.Circle;
import LLD.StructuralPatterns.BridgePattern.Implementor.RasterRenderer;
import LLD.StructuralPatterns.BridgePattern.Implementor.Renderer;

public class client {
    public static void main(String[] args) {
        Renderer rasterRenderer = new RasterRenderer() ; 
        Circle circle = new Circle(rasterRenderer , 5);  
        circle.draw() ; 
    }
}
