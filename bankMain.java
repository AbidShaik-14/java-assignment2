abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}
class DigitalBank extends BankAccount {
    void deposit() {
        System.out.println("Deposited");
    }

    void withdraw() {
        System.out.println("Withdrew");
    }
    void balance() {
        System.out.println("Balance checked");
    }
    void payOnline() {
        System.out.println("Paid Online");
    }
}
public class bankMain {
    public static void main(String[] args) {
        BankAccount acc = new DigitalBank();
        acc.deposit();
        acc.withdraw();
        acc.balance();

        DigitalBank dig = new DigitalBank();
        dig.payOnline();
    }
}
