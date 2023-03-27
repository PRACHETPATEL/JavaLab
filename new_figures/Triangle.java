package new_figures;
import figures.Shape;
public class Triangle extends Shape {
    double base,hieght;
    public Triangle(double x,double y){
        this.hieght=y;
        this.base=x;
    }
    public void calculatearea(){
        this.area=0.5*base*hieght;
    }
    public void display(){
        System.out.println("Area of Triangle: "+this.area);
    }
}
