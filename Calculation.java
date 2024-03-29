import java.util.InputMismatchException;
import java.util.Scanner;
class EnteredZero extends Exception{
    EnteredZero(String arg){
        super(arg);
    }
}
class NegativeNumber extends Exception{
    NegativeNumber(String arg){
        super(arg);
    }
}
public class Calculation {
    public static int n=0,avg=0,count=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=in.nextInt();
        while (n == 0) {
            try {
                throw new EnteredZero("Value of array size is zero");
            } catch (EnteredZero e) {
                System.out.println(e);
                System.out.println("Enter the size of array Again:");
                n = in.nextInt();
            }
        }
        int[] array=new int[n];
        System.out.println("Enter "+n+" Values:");
        for (int i=0;i<n;i++){
            try {
                String temp =in.next();
                Integer input=Integer.parseInt(temp);
                if (input< 0) {
                    throw new NegativeNumber("Entered value is Negative");
                }
                else {
                    array[i]=input;
                    avg+=array[i];
                }
            }
            catch (NegativeNumber e){
                System.out.println(e);
                count++;
            }
            catch(NumberFormatException e){
                System.out.println(e);
                count++;
            }
        }
        System.out.println("Array of size: "+n);
        System.out.println("Total Negative or non-Integer elements in array: "+count);
        System.out.println("Total Positive Integers in array: "+(n-count));
        System.out.println("Average of All Positive Integers:"+(avg/(n-count)));
    }
}

