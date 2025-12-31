package LLD.StructuralPatterns.DecoratorPattern.Component;

public class PlainTextView implements TextView {
    public String text ; 
    public PlainTextView( String text){
        this.text = text ; 
    }
    @Override
    public void display(){
        System.out.print(text) ; 
    }
    
}
