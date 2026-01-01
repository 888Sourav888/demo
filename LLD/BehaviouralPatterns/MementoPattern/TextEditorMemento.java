package LLD.BehaviouralPatterns.MementoPattern;

public class TextEditorMemento {
    private final  String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    String getState(){
        return content ; 
    }

}
