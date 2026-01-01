package LLD.BehaviouralPatterns.VisitorPattern;

import LLD.BehaviouralPatterns.VisitorPattern.Visitor.CircleAreaVisitor;

public class client {
    public static void main(String[] args){
        Shape circle = new Circle(5) ; 
        circle.accept(new CircleAreaVisitor()) ; 
        
    }   
}
