import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "\u0000\u0000";
        String t = "\u0000c";
        StringBuilder sb= new StringBuilder(str);
        StringBuilder sb1= new StringBuilder(t);

        int l = count(sb);
        int m = count(sb1);
        l=sb.length();
        m=sb1.length();
        System.out.println(sb.charAt(1)+"wert");
        System.out.println(m + " " + l);
        System.out.println(str.length() + " " + str);
        System.out.println(t.length() + " " + t);
    }

    public static int count(StringBuilder stri) {
        int k = 0;
        for (int i = 0; stri.charAt(i) > '\0'; i++) {
            k++;
            System.out.println(k);

        }
        return k;
    }
}
