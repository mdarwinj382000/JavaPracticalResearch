import java.io.PrintStream;

class BankAccount {
    public static PrintStream Mout = System.out;
    private final long accountno;
    private String bankname;
    private int bankid;
    private long upi;
    //accountno is updated

    BankAccount(long accountno){
        this.accountno=accountno;
    }
    //entered accountdata is printed...

    void printdata() {
        Mout.println();
        Mout.println("<------Account Details Captured----->");
        Mout.println("Account No:" + accountno);
        Mout.println("Bank Name :" + bankname);
        Mout.println("Bank ID   :" + bankid);
        Mout.println("UPI No    :" + upi);
        Mout.print("Confirm the Bank Details you Entered(Y/N):");
    }
    //getting the bank details...
    void GetbankDetails() {
        Mout.println("<-----ENTER THE ACCOUNT DETAILS----->");
        Mout.print("Enter the Bank Name :");
        bankname = Javarev.customerdata.next();
        Mout.print("Enter the Bank ID  :");
        bankid = Javarev.customerdata.nextInt();
        Mout.print("Enter the UPI No    :");
        upi = Javarev.customerdata.nextLong();

    }

}
