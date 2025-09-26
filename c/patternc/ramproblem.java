package c.patternc;
import java.util.Scanner;
public class ramproblem{
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
          System.out.print("enter thev alue of x : ");
          int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(i+1);j++){
                int x = 0;
                for(int k=0;k<j;k++){
                    x = (x+n)-k;
                }
                if(j%2 == 0){
                    System.out.print((x+i+1)-j +" ");
                }else{
                    System.out.print((x+n)-i +" ");
                }
            }
            System.out.println();
        }
      
      }
    }