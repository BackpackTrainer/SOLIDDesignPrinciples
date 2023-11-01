package mediaLibrary;

class ImageViewer implements ImageMediaPlayer {
    // Implementation skipped for brevity
    public void display() {
        System.out.println("The image is displayed");
    }
    public void printInfo() {
        System.out.println("The image is printed");
    }
    public void loadMedia(String filename) {
        System.out.println("The image is loaded");
    }
}