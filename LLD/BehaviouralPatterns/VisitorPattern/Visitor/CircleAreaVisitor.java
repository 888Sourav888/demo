package LLD.BehaviouralPatterns.VisitorPattern.Visitor;

import LLD.BehaviouralPatterns.VisitorPattern.Circle;

public class CircleAreaVisitor implements Visitor {
    @Override
    public void visitCircle(Circle c) {
    
        System.out.println( "Area of given circle : "  + Math.PI * c.radius * c.radius );
    }
}
