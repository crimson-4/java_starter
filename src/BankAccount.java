public class BankAccount {
    private String accountHolder;
    private  int accoundNumber;
    private  double balance;

    public BankAccount(String accountHolder,int accoundNumber)
    {
        this.accoundNumber=accoundNumber;
        this.accountHolder=accountHolder;
        this.balance=balance=0;
    }
    public void depost(double amount)
    {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited"+amount);
        }else {
            System.out.println("Invalid Deposit amount");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdrew"+amount);
        }
    }
    public void displayInfo(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number : "+accoundNumber);
        System.out.println("Balance :"+balance);
        System.out.println("------------------");

    }

    public  int getAccoundNumber()
    {
        return  accoundNumber;
    }
}
