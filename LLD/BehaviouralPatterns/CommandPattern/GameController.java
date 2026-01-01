package LLD.BehaviouralPatterns.CommandPattern;

import LLD.BehaviouralPatterns.CommandPattern.Command.ButtonCommand;
import java.util.*;
public class GameController {
    List<ButtonCommand> buttonCommands;
    public GameController(){
        buttonCommands = new ArrayList<>();
    }
    public void setCommand(ButtonCommand command){
        buttonCommands.add(command);
    }
    public void executeCommand(int index){
        if(index < buttonCommands.size()){
            buttonCommands.get(index).execute();
        }
    }
}
