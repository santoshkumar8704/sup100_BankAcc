public class BankAccount {
    public double AccountNumber;
    public String name;
    public double balance;
    public BankAccount( double AccountNumber , String name, double balance){
        this.name = name;
        this.balance = balance;
        this.AccountNumber = AccountNumber;
    }
    public double Deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Your Transaction is Completed And your Remaining Balance is"+ balance );
            return balance;
        }
        System.out.println("Check the amount you entered it's invalid");
        return balance;
    } 
    public double Withdraw(double amount){
        if(amount <0){
            System.out.println("Check the amount you entered it's invalid");
        }
        if(amount <= balance){
            balance -= amount;
             System.out.println("Your Transaction is Completed And your Remaining Balance is "+ balance );
             return balance;
        }
        System.out.println("Ooops! insufficient balance");
        return balance;
    }
    public double displayBalance(){
        System.out.println("Your current balance is "+ balance);
        return balance;

    }
    public static void main(String[] args){
    BankAccount myAccount = new BankAccount(1000000, "123456789", 1000.00);
    myAccount.displayBalance();
    myAccount.Deposit(1000);
    myAccount.Withdraw(1000);
}
}
