import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Dynouse {
    static PrintStream Mout = System.out;

    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
       //size = s.nextInt();
        boolean loop;
        do {
            size=/*new Random().nextInt(15)+*/4;
            //top of the house
            for (int row = 1; row <= size; row++) {
                for (int i = 1; i <= size - row; i++) {
                    Mout.print(" ");
                }
                for (int i = 1; i <= row; i++) {
                    Mout.print(row != 1 ? i == 1 || i == row ? i == 1 ? "/ " : "\\" : "  " : "|");
                }
                Mout.println();
            }
            // body of the house
            for (int row = 1; row <= size + 2; row++) {
                if (row == 1 || row == size + 2 || row == (size + 2) / 2) {
                    for (int i = 1; i <= size; i++) {
                        Mout.print("- ");
                    }
                } else {
                    for (int i = 1; i <= size; i++) {
                        Mout.print(i == 1 || i == size ? "| " : "  ");
                    }
                }
                Mout.println();
            }
            Mout.print("continue:(y/n):");
            loop= s.next().contains("y");

        }while (loop);
        s.close();
}
}
