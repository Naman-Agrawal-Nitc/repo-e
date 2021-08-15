public class Bank {
    public String bankName;
    public int IFSC;

    public Bank(String bankName, int IFSC) {
        this.bankName = bankName;
        this.IFSC = IFSC;
    }

    public void displayInfo(BankAccount customer){
        System.out.println("Bank is "+bankName+ " and IFSC no. is "+IFSC);
        System.out.println("customer name is "+customer.getCustomerName());
        System.out.println("Account no. is "+customer.getAccountNumber());
        System.out.println("Balance is "+customer.getBalance());
    }
}
