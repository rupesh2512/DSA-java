package recursion;

import java.util.Scanner;

public class travel {
    public static void print(int n , String s) {
        if(n==s.length()) return;
        else if(s.charAt(n)=='a'){
            
        }
        else {System.out.print(s.charAt(n)+" ");}
        print(n+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        print(0,str);
    }
}
