package synchronized_;

class AccountBank{
    private String account_holder;
    private double account_total_amount;

    public AccountBank(String account_holder, double account_total_amount) {
        this.account_holder = account_holder;
        this.account_total_amount = account_total_amount;
    }

    public void take_money(double quantity_take){
        System.out.println("mister "+account_holder+"in your account "+quantity_take+" there are so many dollars");
    }
}
public class Synchron_2 {
}
