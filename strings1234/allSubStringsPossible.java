package strings1234;

import java.util.Scanner;

public class allSubStringsPossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length(); j++) {
                System.out.print(str.substring(i,j)+ "  ");
            }
            System.out.println();
        }
    }
}
