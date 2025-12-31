package LLD.StructuralPatterns.CompositePattern;


public class client{
    public static void main(String[] args) {
        FileSystem file1 = new file("file1.txt", 100);
        folder folder1 = new folder("folder1") ; 
        folder1.add(file1) ; 

        folder1.displayStructure("--");
        folder folder2 = new folder("folder2") ;
        FileSystem file2 = new file("file2.txt", 200);
        folder2.add(file2) ; 
        folder1.add(folder2) ;
        
        folder1.displayStructure("--");
        

    }
}