package new_figures;
public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(20,30);
        triangle.calculatearea();
        triangle.display();
        Rectangle rectangle=new Rectangle(30,30);
        rectangle.calculatearea();
        rectangle.display();
    }
}
