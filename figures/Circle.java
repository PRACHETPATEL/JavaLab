package figures;
public class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void calculatearea() {
        this.area=pi*radius*radius;
    }
    public void display(){
        System.out.println("Area of Circle: "+this.area);
    }
}
