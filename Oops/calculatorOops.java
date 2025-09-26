package Oops;
class calculator{
    public void add(int a,float b){
        System.out.println("int float");
    }
    // public void add(double a){
    //     System.out.println("double double");
    // }
    public void add(float a,int b){
        System.out.println("float int ");
    }

}

public class calculatorOops {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(7.6f,9); //float int call
        // c.add(19,45); CE :: ambigious method call
        // c.add(5,87.4);  int float cal
    }
}
