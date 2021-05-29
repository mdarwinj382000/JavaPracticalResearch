import java.io.InputStream;
import java.util.Scanner;


public class Javarev {
    static InputStream Minp = System.in;
    static Scanner customerdata = new Scanner(Minp);

    public static void main(String[] args) {
        boolean bankconfirmation,repeat;
        do {
            do {
                BankAccount.Mout.print("Enter the Account No:");
                BankAccount customer = new BankAccount(customerdata.nextLong());
                customer.GetbankDetails();
                customer.printdata();
                bankconfirmation = 'y' == customerdata.next().charAt(0);
            } while (!bankconfirmation);
            BankAccount.Mout.println("Do you like to enter again!!");
            repeat=customerdata.next().contains("y");
        }while (repeat);

    }


}
