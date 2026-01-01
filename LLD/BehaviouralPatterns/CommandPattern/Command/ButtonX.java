package LLD.BehaviouralPatterns.CommandPattern.Command;

import LLD.BehaviouralPatterns.CommandPattern.Protagonist;

public class ButtonX implements ButtonCommand {
    Protagonist protagonist;    
    public ButtonX(Protagonist p ){
        this.protagonist = p;
    }
    @Override
    public void execute() {
        protagonist.jump();
    }
}
