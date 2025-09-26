package Oops.ReturnType;
class parent{
    public Object meth1(){
        return null;
    }
}
class child extends parent{
    public Object meth1(){
        System.out.println("return from child side...");
        return null;
    }
}
public class methodReturnType {
    public static void main(String[] args) {
        parent c=new child();
        c.meth1();
    }
}
