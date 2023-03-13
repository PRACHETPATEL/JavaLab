import java.util.*;
class Cricket{
    String name;
    int age;
    void setdata(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Name:");
        this.name=in.nextLine();
        System.out.print("Enter Age:");
        this.age=in.nextInt();
    }
    void display(){
        System.out.println("Player Name          :"+this.name);
        System.out.println("Player Age           :"+this.age);
    }
}
class Match extends Cricket{
    int no_of_odi,no_of_test;
    public static void main(String[] args) {
        Match[] arr=new Match[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 player details");
        for(int i=0;i<5;i++){
            arr[i]=new Match();
            System.out.println("Enter player "+(i+1)+" details:");
            arr[i].setdata();
            System.out.print("Enter Number of ODI's Played:");
            arr[i].no_of_odi=input.nextInt();
            System.out.print("Enter Number of TEST's Played:");
            arr[i].no_of_test=input.nextInt();
        }
        System.out.println("\nDisplaying 5 player details");
        for(int i=0;i<5;i++){
            System.out.println("Player "+(i+1)+"\n");
            arr[i].display();
            System.out.println("Number of ODI played :"+arr[i].no_of_odi);
            System.out.println("Number of TEST played:"+arr[i].no_of_test);
        }
    }
}