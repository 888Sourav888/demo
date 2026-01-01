package LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler;

import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Form;

public abstract class BaseHandler implements FormHandler {
    protected FormHandler nextHandler;

    @Override
    public void setNextHandler(FormHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Form request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
