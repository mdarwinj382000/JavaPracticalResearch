import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.*;

public class PracticeRegex {
    static PrintStream mout = System.out;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run1;
        String strpat;
       // do {
         //   mout.print("What is the pattern-->");
           strpat="([a-zA-Z0-9]*)@([a-zA-z0-9]*)(\\.[a-zA-z]{3,})";
           //strpat="watcher|cash";
           do {
                // Pattern pattern = Pattern.compile(".xx.");
                mout.print("Enter the String-->");
                String temp = s.next();
                // Matcher match = pattern.matcher(temp);
                mout.println(Pattern.matches(strpat, temp));
                mout.print("do you want to change the pattern(y/n)-->");
                //run1=s.next().charAt(0)=='y';
            } while (s.next().charAt(0)=='y');
           // mout.print("do you want to continue-->");
           // run2=s.next().charAt(0)=='y';
           // mout.println();
       // } while (run2);
    }
}
