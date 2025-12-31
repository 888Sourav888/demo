package LLD.StructuralPatterns.FacadePattern;

public class client {
    public static void main(String[] args) {
        RunFacade run = new RunFacade("example.java");
        run.run();
    }
}
