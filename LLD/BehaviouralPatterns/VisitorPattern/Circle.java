package LLD.BehaviouralPatterns.VisitorPattern;

import LLD.BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

public class Circle implements Shape {

    public int radius ; 
    Circle( int radius ){
        this.radius = radius ; 
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
