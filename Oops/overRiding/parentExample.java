package Oops.overRiding;
class parent{
    public void property(){
        System.out.println("gold car .....");

    }
    public void marry(){
        System.out.println("relative girl.......");
    }
}
class child extends parent{
    public void marry(){
        System.out.println("his own choice ");
    }

}

public class parentExample {
    public static void main(String[] args) {
        parent p1=new parent();
        p1.property();
        p1.marry();
        child c1=new child();
        c1.property();
        c1.marry();
        parent p2=new child();
        p2.property();
        p2.marry();
    }
}
