import java.util.*;
class BankAccount{
    String Depositorname,Acc_type; 
    static int Acc_no=0;
    int Balance,pin;
    public static void main(String[] args) {
        int n,i=0,j,amount;
        BankAccount[] acc=new BankAccount[100];
        Scanner x=new Scanner(System.in);
        do{
            System.out.println("1.Create Account");
            System.out.println("2.Deposit amount");
            System.out.println("3.Withdraw amount");
            System.out.println("4.Balance Enquiry");
            System.out.println("5.Exit");
            System.out.println("Choose a number:");
            n=x.nextInt();
            switch(n){
                case 1:
                    acc[i]=new BankAccount();
                    acc[i].createAcc();
                    i++;
                    System.out.println();
                break;
                case 2:
                    System.out.println("Enter your Account Number:");
                    j=x.nextInt();
                    j--;
                    if(j<i)
                    {
                        System.out.println("Enter amount to deposit: ");
                        amount=x.nextInt();
                        acc[j].deposit(amount);
                        System.out.println("Amount Deposited");
                    }
                    else
                    System.out.println("Invalid Account Number");
                    System.out.println();
                break;
                case 3:
                    System.out.println("Enter your Account Number:");
                    j=x.nextInt();
                    j--;
                    if(j<i)
                    {
                        System.out.println("Enter amount to Withdraw: ");
                        amount=x.nextInt();
                        acc[j].withdraw(amount);
                    }
                    else
                    System.out.println("Invalid Account Number");
                    System.out.println();
                break;
                case 4:
                    System.out.println("Enter your Account Number:");
                    j=x.nextInt();
                    j--;
                    if(j<i)
                    acc[j].balanceinquiry();
                    else
                    System.out.println("Invalid Account Number");
                    System.out.println();
                break;
                case 5:
                break;
                default:
                    System.out.println("Invalid Choice");
                break;
            }
        }while(n!=5&&i<100);
    }
    public void createAcc(){
        Scanner input=new Scanner(System.in);
        Acc_no++;
        System.out.print("Enter your name   : ");
        this.Depositorname=input.nextLine();
        System.out.print("Enter Account Type: ");
        this.Acc_type=input.next();
        this.Balance=0;
        System.out.println("Your Generated Account number is:"+Acc_no);
    }
    public boolean deposit(int x){
        int amount;
        amount=x;
        if(amount>0)
        this.Balance+=amount;
        else
        {
            System.out.println("Cant deposite value less than equal to zero!!");
            return false;
        }
        return true;
    }
    public boolean withdraw(int x){
        int amount;
        amount=x;
        if((Balance-amount)>=0){
            this.Balance-=amount;
            System.out.println("Amount Withdrawed");
        }
        else{
            System.out.println("Not Sufficient Balance");
            return false;
        }
        return true;
    }
    public void balanceinquiry(){
        System.out.println("Account holder name is : "+this.Depositorname);
        System.out.println("Your Account type is   : "+this.Acc_type);
        if(this.Balance>0)
        System.out.println("Your Account Balance is: "+this.Balance+" INR");
        else
        System.out.println("Your Account Balance is: NULL");
    }
}