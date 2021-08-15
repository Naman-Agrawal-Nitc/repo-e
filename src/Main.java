public class Main {
    public static void main(String[] args) {

        BankAccount Account1=new BankAccount(1234,"abc","abc@target.com","7024239924");
        System.out.println(Account1.getBalance());

        Account1.depositMoney(1000);
        Account1.depositMoney(500);
        Account1.withdrawMoney(2000);
        Account1.withdrawMoney(100);

        System.out.println(Account1.getPhoneNumber());
        System.out.println(Account1.getCustomerName());

        Bank bank1=new Bank("bank1",123);
        bank1.displayInfo(Account1);


    }
}
