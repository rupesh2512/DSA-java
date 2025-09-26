package Oops.ReturnType;

import Oops.string;

class parent{
    public void meth1(){
        System.out.println("from parent");
    }
}
class child extends parent{
    public void meth1(){
        System.out.println("return from child side...");
    }
}
public class differentAxisModifier {
    public static void main(String[] args) {
        parent c=new child();
        c.meth1();
    }
}
