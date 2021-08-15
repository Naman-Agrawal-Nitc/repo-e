public class BankAccount {

    public int accountNumber;
    public double balance;
    public String customerName;
    public String emailId;
    public String phoneNumber;

    public BankAccount(int accountNumber, String customerName, String emailId, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double amount){
        balance+=amount;
        System.out.println(amount +" is added to your account");
        System.out.println("your balance now is "+balance);
    }

    public void withdrawMoney(double amount){
        double newBalance=balance-amount;
        if (newBalance<0){
            System.out.println("Insufficient Balance");
            System.out.println("Your balance remains "+balance);
        }
        else{
            balance=newBalance;
            System.out.println(amount+" is withdrawn successfully");
            System.out.println("your balance now is "+balance);
        }
    }
}
