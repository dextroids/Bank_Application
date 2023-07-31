package banking;

public class lotakBank implements RbiSystem {

    private String accNo;
    private String passcode;
    private double rateofinterest = 6.1;
    private double balance;

    public lotakBank(String accNo, String passcode, double balance) {
        this.accNo = accNo;
        this.passcode = passcode;
        this.balance = balance;
    }

    public String addmoney(int money) {
        if (money > 0) {
            balance = balance + money;
            return "Money :" + money + "has been added to your Account. total balance is" + balance;
        } else {
            return "you cannot add money to your account";
        }
    }

    public String withDrawMoney(int money, String password) {
        if (password.equals(this.passcode)) {
            if (balance >= money) {
                balance =balance-money;
                return "Money:"+ money+"has been withdrawl from your account. total balance is:" +balance;
            }
            else{
                return "you have a insufficient balance";
            }
    }
        else
    {
        return "password is Incorrect";
    }

}

    public String checkBal(String password) {
        if (passcode.equals(this.passcode)) {
            return "Avalable balance:" + this.balance;
        } else {
            return "password is incorrect";
        }
    }


    public Double calrateofinterest(int time) {
        double simpleInterest=(balance*time*rateofinterest)/100;

        return simpleInterest;
    }
}

