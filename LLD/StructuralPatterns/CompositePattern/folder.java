package LLD.StructuralPatterns.CompositePattern;
import java.util.* ; 
public class folder implements FileSystem {
    private String name;
    private List<FileSystem> children;

    public folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystem child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystem child : children) {
            child.displayStructure(indent + "  ");
        }
    }    
}
