package new_figures;
import figures.Shape;
public class Rectangle extends Shape {
    double length,breadth;
    public Rectangle(double x, double y){
        this.breadth=y;
        this.length=x;
    }
    public void calculatearea(){
        this.area=length*breadth;
    }
    public void display(){
        System.out.println("Area of Rectangle: "+this.area);
    }
}
