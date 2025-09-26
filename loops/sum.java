package loops;
import java.util.Scanner;
public class sum {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number up to ehich u want to get sum");
        int n = scn.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum of natural numbers up to : "+n);
        System.out.println("is :"+sum);

    }
}
