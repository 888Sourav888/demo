package LLD.BehaviouralPatterns.CommandPattern;
import LLD.BehaviouralPatterns.CommandPattern.Command.*;
public class client {
    public static void main(String[] args){
        Protagonist p = new Protagonist();
        ButtonX buttonX = new ButtonX(p);
        ButtonDPadLeft buttonDPadLeft = new ButtonDPadLeft(p); 
        ButtonDPadRight buttonDPadRight = new ButtonDPadRight(p);

        GameController gameController = new GameController();
        gameController.setCommand(buttonX);
        gameController.setCommand( buttonDPadLeft);
        gameController.setCommand(buttonDPadRight);


        gameController.executeCommand(2);
        gameController.executeCommand(2);
        gameController.executeCommand(2);
        gameController.executeCommand(0);
        gameController.executeCommand(2);
        gameController.executeCommand(2);
        gameController.executeCommand(1);
        gameController.executeCommand(2);
    }
}
