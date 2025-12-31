package LLD.StructuralPatterns.FacadePattern;

public class RunFacade {
    Extract extract = new Extract() ;
    Compile  compile = new Compile() ;  
    Execute  execute = new Execute() ;
    String fileName ; 
    public RunFacade(String f){
        this.fileName = f ; 
    }

    public void run(){
        extract.extractFile(fileName) ; 
        compile.compileFile(fileName) ; 
        execute.execute(fileName) ; 
    }
}
