import java.text.NumberFormat;
import java.util.Locale;

public class learnjava {
    public static void main(String[] args) {
        Locale le = Locale.FRANCE;
        NumberFormat cf = NumberFormat.getCurrencyInstance(le);

        System.out.println(cf.format(1.73));

    }
}
