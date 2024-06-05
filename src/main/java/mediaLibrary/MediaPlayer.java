//TODO:  Refactor the MediaPlayer interface into smaller interfaces
// so that no class is forced to implement methods it does not need.
// You may add any new classes or methods you feel appropriate

package mediaLibrary;

public interface MediaPlayer {
    void play();
    void display();
    void printInfo();
    void loadMedia(String filename);
}
