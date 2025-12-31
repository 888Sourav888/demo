package LLD.StructuralPatterns.DecoratorPattern.Decorator;

import LLD.StructuralPatterns.DecoratorPattern.Component.TextView;

public class BoldDecorator extends BaseDecorator {

    public BoldDecorator( TextView textView){
        super(textView) ; 
    }

    @Override
    public void display(){
        System.out.print("<b>") ; 
        textView.display() ; 
        System.out.print("</b>") ; 
    }
}
