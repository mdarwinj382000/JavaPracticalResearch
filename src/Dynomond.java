import java.util.Scanner;

public class Dynomond {
    public static void main(String[] args) {
        int size;
        Scanner s=new Scanner(System.in);
        size =s.nextInt();
        int maxcols = size * 2 + 2;
        TopBottom(maxcols);
        System.out.println();
        boolean inc;
        inc = size==1;
        for (int j =inc?size:1;inc?j>0:j <=size;) {
            System.out.print("|");
            for (int k = 0; k < size - j; k++) {
                System.out.print(" ");
            }
            System.out.print(inc?j==size?"<":"\\":"/");
            for (int i = 0; i < j * 2 - 2; i++) {
                System.out.print(j%2==0?"-":"=");
            }
            System.out.print(inc?j==size?">":"/":"\\");
            for (int k = 0; k < size - j; k++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
            if(inc){j--;}else{j++;}
            if(j==size){inc=true;}
        }
        TopBottom(maxcols);
        s.close();
    }
    private static void TopBottom(int maxcols) {
        System.out.print("+");
        for (int i = 1; i < maxcols - 1; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
