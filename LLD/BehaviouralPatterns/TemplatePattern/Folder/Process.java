package LLD.BehaviouralPatterns.TemplatePattern.Folder;

public abstract class Process {
    
    public void template(){
        step1();
        step2();
        step3();
    }

    public void step1(){
        System.out.println("Step 1 from template class");
    }
    public abstract void step2(); 
    public void step3(){
        System.out.println("Step 3 from template class");
    }
}
