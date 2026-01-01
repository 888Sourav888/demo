package LLD.BehaviouralPatterns.VisitorPattern;

import LLD.BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

public interface Shape {
    public void accept(Visitor visitor);
}
