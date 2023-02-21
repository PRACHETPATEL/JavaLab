import java.util.Scanner;
class Employee{
    float dearnessallowance;
    int basicsalary;
    String Name;
    static int count=1000;
    public static void main(String[] args) {
        int n,i=0,j=0;
        Employee[] obj=new Employee[100];
        Scanner x=new Scanner(System.in);
        do{
            System.out.println("1.Enter Details");
            System.out.println("2.Calculate and Display Details");
            System.out.println("3.Exit");
            System.out.print("Choose a number:");
            n=x.nextInt();
            switch(n){
                case 1:
                   obj[i]=new Employee();
                   obj[i].input();
                   i++;
                break;
                case 2:
                System.out.print("Enter your Reference ID Number:");
                j=x.nextInt();
                j-=1000;
                if(j<i&&j>=0)
                    obj[j].displaydetails();
                else
                    System.out.println("Invalid Reference ID");
                break;
                case 3:
                break;
                default:
                    System.out.println("Invalid Choice");
                break;
            }
        }while(n!=3&&i<100);
        x.close();
    }
    void input(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        this.Name=in.nextLine();
        System.out.print("Enter Your Annual Salary : ");
        this.basicsalary=in.nextInt();
        System.out.println();
        System.out.println("Your input reference ID is : "+count);
        count++;
    }
    void displaydetails(){
        this.dearnessallowance=((float)0.74*(float)(this.basicsalary));
        float grossSalary=this.basicsalary+this.dearnessallowance;
        System.out.println("Your Name is                     : "+this.Name);
        System.out.println("Your Annual Salary               : "+this.basicsalary);
        System.out.println("Calculated Dearness Allowance is : "+this.dearnessallowance);
        if(grossSalary>100000){
        System.out.println("TDS charged is                   : "+((float)(0.10)*grossSalary));
        System.out.println("Your Net Salary is               : "+grossSalary);
        }
        else{
        System.out.println("TDS charged is                   : NIL");
        System.out.println("Your Net Salary is               : "+grossSalary);
        }
    }
} 