package banking;

public interface RbiSystem {

    public String addmoney(int money);
    public String withDrawMoney(int money ,String password);
     public String checkBal(String password);

     public Double calrateofinterest(int time);
}
