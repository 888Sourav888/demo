package LLD.BehaviouralPatterns.ChainOfResponsibilityPattern;

import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler.DBHandler;
import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler.FormHandler;
import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler.ValidationHandler;

public class client {
    public static void main(String[] args){
        FormHandler validationHandler = new ValidationHandler();
        FormHandler dbHandler = new DBHandler();

        validationHandler.setNextHandler(dbHandler);

        Form form = new Form();
        form.firstName = "John";
        form.lastName = "Doe";
        form.age = 30;
        form.phoneNumber = 1234567890;
        form.email = "" ; 

        validationHandler.handleRequest(form);
        
    }
}
