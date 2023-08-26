package week3day1;

public class AxisBank  extends BankInfo{

	// Overriding the deposit() method in AxisBank
    public void deposit() {
        System.out.println("Deposit method");
    }
    public static void main(String[] args) {
        BankInfo bank = new BankInfo();
        AxisBank axisBank = new AxisBank();

        bank.saving();   // Call saving() from BankInfo
        bank.fixed();    // Call fixed() from BankInfo
        bank.deposit();  // Call deposit() from BankInfo

        axisBank.deposit();  // Call overridden deposit() from AxisBank
    }
}
