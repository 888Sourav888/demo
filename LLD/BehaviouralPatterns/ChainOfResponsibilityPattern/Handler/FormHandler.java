package LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Handler;

import LLD.BehaviouralPatterns.ChainOfResponsibilityPattern.Form;

public interface FormHandler {
    public void setNextHandler(FormHandler nextHandler);
    public void handleRequest(Form request);
}
