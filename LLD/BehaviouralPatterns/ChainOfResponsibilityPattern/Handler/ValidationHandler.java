package LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler;

import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Form;

public class ValidationHandler extends BaseHandler {
    @Override
    public void handleRequest(Form request) {
        boolean isvalid = true ; 
        if(request.firstName == null || request.firstName.isEmpty()){
            isvalid = false ; 
            System.out.println("First Name is required");
        }

        System.out.println("Validation completed");
        if(isvalid){
            System.out.println("validation passed, passing to next handler");
            nextHandler.handleRequest(request);
        }
    }
}
