import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();
        int mid = len / 2;

        String firsthalf = str.substring(0, mid);
        String secondhalf = str.substring(mid);

        int Fcount = 0, Scount = 0;

        for (char ch : firsthalf.toCharArray()) {
            if (("aeiouAEIOU".indexOf(ch) != -1) && (firsthalf != secondhalf  ) ) {
                Fcount++;
            }
        }

        for (char ch : secondhalf.toCharArray()) {
            if ( "aeiouAEIOU".indexOf(ch)   != -1  )  {
                Scount++;
            }
        }

        System.out.println("First half vowel count: " + Fcount);
        System.out.println("Second half vowel count: " + Scount);
        System.out.println("Absolute difference: " + Math.abs(Fcount - Scount));
    }
}
