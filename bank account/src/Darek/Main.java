package Darek;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBallance(-1);
        System.out.println(account1.getBallance());

        VipCostumer Darek = new VipCostumer();
        VipCostumer Ola = new VipCostumer("Ola",20000.0,"ola@gmail.com");
        System.out.println(Darek.getCreditLimit());
        System.out.println(Ola.getCreditLimit());

	// write your code here
    }
}
