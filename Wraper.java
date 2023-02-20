import java.util.*;
class Wraper {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two values");
        int x=in.nextInt();
        int y=in.nextInt();
        Integer i=new Integer(x);
        Integer j=Integer.valueOf(y);
        int a=i.intValue();
        System.out.println("Wrapper object to premitive int "+a);
        System.out.println("premitive int to Wrapper object "+j);
        in.close();
    }
}
