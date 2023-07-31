package banking;

public class Bmwbank implements RbiSystem  {
    private String accountNo;
    private String password;
    private double rateofinterest = 7.5;

    private double balance;

    private Integer minbalance=500;
    public Bmwbank(double accountNo, String password, double balance) {
        this.accountNo = String.valueOf(accountNo);
        this.password = password;
        this.balance = balance;
    }


    public String addmoney(int money) {
        if(money>0)
        {
            balance=balance+money;
            return "Money:"+money+" has been added to your account";
        }
        else{
            return "balance is negative";
        }
    }

    public String withDrawMoney(int money,String password) {
        if(password.equals(this.password))
        {
            if(balance-minbalance>=money){
                balance=balance-money;
                return "Money:"+ money+"has been withdrawl from your account. total balance is:" +balance;
            }
            else{
                return "insuffiecient balance";
            }
        }
        else{
            return "incorrect password";
        }
    }

    public String checkBal(String password) {
        if(password.equals(this.password)){
            return "balance in your Account is"+this.balance;
        }
        else{
            return "password is incorrect";
        }
    }


    public Double calrateofinterest(int time) {
        double simpleinterest=(time*rateofinterest*balance)/100;
        return simpleinterest;
    }
}
