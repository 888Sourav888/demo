package LLD.StructuralPatterns.DecoratorPattern.Decorator;

import LLD.StructuralPatterns.DecoratorPattern.Component.TextView;

public class ItalicDecorator extends BaseDecorator {

    public ItalicDecorator( TextView textView){
        super(textView) ; 
    }

    @Override
    public void display(){
        System.out.print("<i>") ; 
        textView.display() ; 
        System.out.print("</i>") ; 
    }
}