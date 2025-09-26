package Oops.Abstract;
abstract class parent{
    public abstract void firstm();
}
class child extends parent{
    public void firstm(){
        System.out.println("hello");
    }
}
// -->>abstract is an access modifer applicable at
//     a. method -> If we are not giving the body for a method then mark the method 
//        as "abstract".
//     b. class  -> If we don't want the object to be created for a class, then mark 
//        the class as "abstract".
//     c. variable-> This access modifier can't be applied on variables.
//      -->>In case of overriding, compulsorily the child class should give implementation for 
//          all the abstract methods present in the parent class, if the implementation is not 
//          given then that child class should be marked as "abstract".
public class abstractExample {
    public static void main(String[] args) {
        parent p=new child();
        p.firstm();
    }
}
