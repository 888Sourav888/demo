package LLD.StructuralPatterns.DecoratorPattern;

import LLD.StructuralPatterns.DecoratorPattern.Component.PlainTextView;
import LLD.StructuralPatterns.DecoratorPattern.Component.TextView;
import LLD.StructuralPatterns.DecoratorPattern.Decorator.BoldDecorator;
import LLD.StructuralPatterns.DecoratorPattern.Decorator.ItalicDecorator;

public class client {
    public static void main(String[] args) {
        TextView text = new PlainTextView("Testing Decorator Pattern") ; 
        text = new BoldDecorator(text) ; 
        text = new ItalicDecorator(text) ; 

        text.display() ;
        
    }
}
