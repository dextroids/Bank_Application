package banking;
import java.util.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.println("which bank you want to open an Account");
        System.out.println("print 1 to open in lotakbank and 2 for Bmwbank");
        int option=sc.nextInt();
        RbiSystem  BankAccount;
        System.out.println("Enter password and intial deposit");
        String password=sc.next();
        Integer intialbalance=sc.nextInt();
        double AccNo =Math.abs(Math.random()*Math.pow(10,9));
        String Stringversion = String.valueOf(AccNo);
        if(option==1)
        {

            BankAccount = new lotakBank(Stringversion,password,intialbalance);
        }
        else{

            BankAccount = new Bmwbank(AccNo,password,intialbalance);
        }
        String result=  BankAccount.withDrawMoney(700000,"sha123");
        System.out.println(result);
        result= BankAccount.addmoney(7000);
        System.out.println(result);


       result= BankAccount.withDrawMoney(70000,"sha123");
       System.out.println(result);

        System.out.println(BankAccount.checkBal("sha123"));
        System.out.println(BankAccount.calrateofinterest(3));
    }
}