package LLD.BehaviouralPatterns.MementoPattern;


public class client {
    public static void main(String[] args){
        TextEditor editor = new TextEditor() ;
        TextUndoOperator undoOperator = new TextUndoOperator(editor) ;

        editor.type("This is the first sentence. ") ;
        undoOperator.saveState() ;

        editor.type("This is the second sentence. ") ;
        undoOperator.saveState() ;

        undoOperator.undo() ;

        System.out.println(editor.getContent()) ;

    }
}
