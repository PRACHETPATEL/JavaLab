import java.util.Scanner;
class NotEnoughMoneyExecption extends Exception{
    NotEnoughMoneyExecption(String arg) {
        super(arg);
    }
}
public class Bank {
    int balance =0;
    Scanner in=new Scanner(System.in);
    void deposit(){
        int temp;
        System.out.println("Enter the amount to deposit:");
        temp=in.nextInt();
        System.out.println("Your Balance Before Deposit: "+ balance);
        balance =temp;
        System.out.println("Your Balance After Deposit: "+ balance);
    }
    void withdraw(){
        try {
            int temp;
            System.out.println("Enter the amount to Withdraw:");
            temp=in.nextInt();
            System.out.println("Your Balance Before Withdraw: "+ balance);
            if(balance-temp<0){
                throw new ArithmeticException("Not Sufficient Balance");
            }
            else if (balance-temp<500) {
                balance-=temp;
                throw new NotEnoughMoneyExecption(""+balance);
            }
            else{
                balance-=temp;
                System.out.println("Your Balance After Withdraw: "+ balance);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NotEnoughMoneyExecption e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Bank temp=new Bank();
        temp.deposit();
        temp.withdraw();
        temp.withdraw();
    }
}
