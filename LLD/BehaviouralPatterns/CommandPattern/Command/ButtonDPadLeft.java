package LLD.BehaviouralPatterns.CommandPattern.Command;

import LLD.BehaviouralPatterns.CommandPattern.Protagonist;

public class ButtonDPadLeft implements ButtonCommand {
    Protagonist protagonist;
    public ButtonDPadLeft(Protagonist p){
        this.protagonist = p;
    }
    @Override
    public void execute() {
        protagonist.moveLeft();
    }
}