package LLD.StructuralPatterns.ProxyPattern;

public class HighResolutionImage implements Image {
    private String fileName;
    private String[] imageChunks ; 

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        this.imageChunks = loadImageChunksFromDisk();
    }

    public String[] loadImageChunksFromDisk(){
        System.out.println("Loading high resolution image from disk: " + fileName);
        // adding sleep time to simulate loading time
        try {
            System.out.println("Waiting for image to load") ;
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new String[] {"chunk1", "chunk2", "chunk3"};
    }

    @Override
    public void display() {
        System.out.println("Displaying high resolution image: " + fileName);
    }

    @Override
    public void getFileName() {
        System.out.println("File name: " + fileName);
    }

}