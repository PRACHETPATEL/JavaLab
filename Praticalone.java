import java.util.*;
class Praticalone{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers for calculation:");
        int numx,numy,n;
        numx=input.nextInt();
        numy=input.nextInt();
        calculator(numx,numy);
        System.out.println("Enter a number for n elements to be displayed in fibonacci series:");
        n=input.nextInt();
        fibonacci(n);
        input.close();
    }
    static void calculator(int x,int y){
        System.out.println("Addition      :"+(x+y));
        System.out.println("Subtraction   :"+(x-y));
        System.out.println("Multiplication:"+(x*y));
        System.out.println("Divison       :"+((double)x/(double)y));
    }
    static void fibonacci(int n){
        int a=0,b=1;
        System.out.print("Fibonacci series:");
        if(n==0){
            return;
        }
        else if(n==1){
            System.out.println(b);
        }
        else if(n==2){
            System.out.println(a+" "+b);
            return;
        }
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
