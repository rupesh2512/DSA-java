import java.util.Scanner;

public class reverseTheSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an array to the system :");
        StringBuilder b = new StringBuilder(sc.nextLine());
        int i=0,j=0;
        int n=b.length();
        while(j<n){
            if(b.charAt(j)!=' ') {j++;}
            else{
                reverse(b,i,j-1);
                j++;
                i=j;
            }
        }
        
        reverse(b,i,j-1);
        System.out.println(b);
    }
    public static void reverse(StringBuilder b, int i, int j) {
        while(i<=j)
        {char temp= b.charAt(i);
        b.setCharAt(i, b.charAt(j));
        b.setCharAt(j, temp);
        i++;j--;}
    }
}
