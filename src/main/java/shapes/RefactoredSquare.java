//Rules of inheritance
// 1.  Semantic Correctness: A square is a rectangle
//2.  Liskov Substitution Principle: A square can be substituted for a rectangle --> this is false

package shapes;

public class RefactoredSquare {
    private Rectangle rectangle;

    public RefactoredSquare(int size) {
        rectangle = new Rectangle();
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }
}
