package Oops;
class demo{
    public void adsf(int a){
        System.out.println("from normal add");
    }
    public void adsf(int... a){
        System.out.println("from variable args");
    }
    
}
// variable argument 
public class variableInt {
    public static void main(String[] args) {
        demo d1=new demo();
        //d.add();
        d1.adsf(2);
        d1.adsf(3,4,6);
    }
}
