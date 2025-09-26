package Oops.interfaces;
interface Icalculator{
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);

}
class calculator implements Icalculator{
    public void add(int a,int b){
        System.out.println("sum is "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("sum is "+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("sum is "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("sum is "+(a/b));
    }

}
public class testFile {
    public static void main(String[] args) {
        Icalculator c=new calculator();
        c.add(10, 20);
        c.sub(100, 20);
        c.mul(10, 20);
        c.div(100, 20);
    }
}
