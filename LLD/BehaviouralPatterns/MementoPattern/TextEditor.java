package LLD.BehaviouralPatterns.MementoPattern;

public class TextEditor {
    //Originator 
    String content = "" ; 
    public void type(String words){
        content = content + words ; 
    }

    public String getContent(){
        return content ; 
    }

    public TextEditorMemento save(){
        return new TextEditorMemento(content) ; 
    }
    public void restore(TextEditorMemento memento){
        content = memento.getState() ; 
    }
}
