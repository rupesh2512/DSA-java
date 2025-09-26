package Oops;
class demo{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public void add(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
    public void add(int a,int b,int c,int d,int e,int f){
        System.out.println(a+b+c+d+e+f);
    }
}
class advancecalculator{
    public void add(int... arg){
        int sum =0;
        for (int data : arg) {
            sum+=data;
        }
        System.out.println(sum);


    }

}

public class multiplemethodCALCULATOR {
    public static void main(String[] args) {
        demo d = new demo();
        d.add(1,2);
        d.add(1,2,3);
        d.add(1,2,3,4);
        d.add(1,2,3,4,5);
        d.add(1,2,3,4,5,6);
        advancecalculator ad=new advancecalculator();
        ad.add(1,2);
        ad.add(1,2,3);
        ad.add(1,2,3,4);
        ad.add(1,2,3,4,5);
        ad.add(1,2,3,4,5,6);
    }
    
}
