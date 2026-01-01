package LLD.BehaviouralPatterns.CommandPattern.Command;

import LLD.BehaviouralPatterns.CommandPattern.Protagonist;

public class ButtonDPadRight implements ButtonCommand {
    Protagonist protagonist;
    public ButtonDPadRight(Protagonist p){
        this.protagonist = p;
    }
    @Override
    public void execute() {
        protagonist.moveRight();
    }
    
}
