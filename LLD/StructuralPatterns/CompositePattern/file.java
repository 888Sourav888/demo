package LLD.StructuralPatterns.CompositePattern;

public class file implements FileSystem {
    private String name;
    private int size;

    public file(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "File: " + name + " (Size: " + size + ")");
    }
}