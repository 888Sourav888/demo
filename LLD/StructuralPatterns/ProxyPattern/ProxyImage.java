package LLD.StructuralPatterns.ProxyPattern;

public class ProxyImage implements Image {
    private String fileName;
    private HighResolutionImage highResolutionImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (highResolutionImage == null) {
            highResolutionImage = new HighResolutionImage(fileName);
        }
        else{
            System.out.println("display already loaded image from cache") ;
        }
        highResolutionImage.display();
    }

    @Override
    public void getFileName() {
        System.out.println("File name: " + fileName);
    }
}