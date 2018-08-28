package Darek;

public class BankAccount {
    private String accountNumber;
    private double ballance;
    private String costumerName;
    private String eMail;
    private String phoneNumber;

    public BankAccount(){
        this("11111",0.0,"Name","email","58 3232233");
        System.out.println("Default Bank account");
    }

    public BankAccount(String accountNumber,double ballance,String costumerName, String eMail, String phoneNumber){
        this.accountNumber=accountNumber;
        this.ballance=ballance;
        this.costumerName=costumerName;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String costumerName, String eMail, String phoneNumber) {
        this("11112",2.22,costumerName,eMail,phoneNumber);
        this.costumerName = costumerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        this.ballance+=amount;
        System.out.println("Deposit of "+amount+"processed. Balance:"+this.ballance);
    }
    public void withDrawal(double amount){
        if(this.ballance-amount<0){
            System.out.println("Only "+ this.ballance+" available. Withdrawal not processed");
        }
        else {
            this.ballance-=amount;
            System.out.println("Withdrawal of "+ amount+"processed. Remaining balance:"+this.ballance);
        }
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBallance(int ballance){
        if (ballance>0) {
            this.ballance = ballance;
        }else
            System.out.println("Invalid value");
    }
    public double getBallance(){
        return ballance;
    }
    public void setCostumerName(String costumerName){
        this.costumerName=costumerName;
    }
    public String getCostumerName(){
        return costumerName;
    }
    public void seteMail(String eMail){
        this.eMail= eMail;
    }
    public String geteMail(){
        return eMail;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }


}
