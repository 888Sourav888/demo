package LLD.BehaviouralPatterns.TemplatePattern;

import LLD.BehaviouralPatterns.TemplatePattern.Folder.Child;
import LLD.BehaviouralPatterns.TemplatePattern.Folder.Daughter;

public class client {
    public static void main(String[] args){
        Child process = new Child() ; 
        Daughter process1 = new Daughter() ;

        process.template();
        process1.template();
    }
}
