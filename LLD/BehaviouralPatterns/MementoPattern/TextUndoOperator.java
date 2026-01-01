package LLD.BehaviouralPatterns.MementoPattern;
import java.util.* ; 
public class TextUndoOperator {
    TextEditor textEditor ;
    Stack<TextEditorMemento> mementoStack = new Stack<>();

    public TextUndoOperator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void saveState() {
        mementoStack.push(textEditor.save());
    }

    public void undo() {
        if (!mementoStack.isEmpty()) {
            textEditor.restore(mementoStack.pop());
        }
    }
}