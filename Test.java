interface GeometricShape {
    public void describe();
}
interface TwoDShape extends GeometricShape {
    public double area();
}
interface ThreeDShape extends GeometricShape {
    public double volume();
}
class Cone implements ThreeDShape {
    private double radius;
    private double height;
    public Cone (double radius, double height){
        this.radius=radius;
        this.height=height;
    }
    public double volume(){
        double vol=((Math.PI)*(Math.pow(radius,2))*(height/3));
        return vol;
    }
    public void describe(){
        System.out.println("Volume of cone: "+this.volume()+" m^3");
    }
}
class Rectangle implements TwoDShape {
    private double width, height;
    public Rectangle (double width, double height){
        this.width=width;
        this.height=height;
    }
    public double area() {
        double a=width*height;
        return a;
    }
    public double perimeter(){
        double p=2*(width+height);
        return p;
    }
    public void describe(){
        System.out.println("Area of rectangle: "+this.area()+" m^2");
        System.out.println("Perimetre of rectangle: "+this.perimeter()+" m");
    }

}
class Sphere implements ThreeDShape {
    private double radius;
    public Sphere (double radius){
        this.radius=radius;
    }
    public double volume(){
        double vol=(double)(4/3)*Math.pow(radius,3)*Math.PI;
        return vol;
    }
    public void describe(){
        System.out.println("Volume of sphere: "+this.volume()+" m^3");
    }
}
public class Test {
    public static void main(String[] args) {
        Cone a=new Cone(4.2,6.54);
        Rectangle b=new Rectangle(14.34,19.48);
        Sphere c=new Sphere(4.41);
        a.describe();
        b.describe();
        c.describe();
    }
}
