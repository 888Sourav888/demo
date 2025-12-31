package LLD.StructuralPatterns.DecoratorPattern.Decorator;

import LLD.StructuralPatterns.DecoratorPattern.Component.TextView;

public abstract class BaseDecorator implements TextView  {
    protected TextView textView ;
    public BaseDecorator( TextView textView){
        this.textView = textView ; 
    }
}
