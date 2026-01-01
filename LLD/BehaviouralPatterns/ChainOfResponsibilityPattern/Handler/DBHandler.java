package LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler;

import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Form;

public class DBHandler extends BaseHandler {
    @Override
    public void handleRequest(Form request) {
        System.out.println("Saving form data to database");
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}