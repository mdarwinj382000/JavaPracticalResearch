import java.io.PrintStream;

public class testrun {
    int add(int i,int j){
        return i-j;
    }

    static PrintStream mout=System.out;

    public static void main(String[] args) {
        testrun r=new testrun();
       mout.println(""+r.add(5,7));
    }
}
