import java.util.*;
abstract class cal{
    int a,b;
    abstract void sum2(int x,int y);
    abstract void sum3(int x,int y,int z);
    void display(){
        System.out.println("Sum of 2 : "+a+"\nSum of 3 : "+b);
    }
}
class add extends cal{
    void sum2(int x,int y){
        a=x+y;        
    }
    void sum3(int x,int y,int z){
        b=x+y+z;        
    }
}
class Demo{
    public static void main(String[] args) {
        add obj=new add();
        obj.sum2(10,20);
        obj.sum3(10,20,30);
        obj.display();
    }
}