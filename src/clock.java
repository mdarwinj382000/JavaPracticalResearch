public class clock {
    public static void main(String[] args) {
        int hr = 0, min = 0, sec = 0;
        while (true) try {
            System.out.println(hr + ":" + min + ":" + sec);
            if (hr == 24 && min == 59 && sec == 59) {
                Thread.sleep(1000);
                System.out.println(00 + ":" + 00 + ":" + 00);
                hr = 0;
            } else if (min == 59 && sec == 59) {
                min = 0;
                hr++;
                Thread.sleep(1000);
                System.out.println(hr + ":" + 00 + ":" + 00);
            } else if (sec == 59) {
                sec = 0;
                min++;
                Thread.sleep(1000);
                System.out.println(hr + ":" + min + ":" + 00);
            }
            Thread.sleep(1000);
            sec++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
