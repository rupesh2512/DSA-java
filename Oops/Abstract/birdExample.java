package Oops.Abstract;
abstract class sample{
    // 1. abstract method 
    // 2. concerrt method 
    // 3. even if there is no abstract method we can mark class as abstract class.
    // -->> by marking class as abstract class we are restricting class to make an object.
    // -->> empty class may be marked as abstract

}
abstract class bird{
    public abstract void fly();
    public abstract void eat();
}
class crow extends bird{
    public void fly(){
        System.out.println("crow fly");
    }
    public void eat(){
        System.out.println("crow eat flesh");
    }

}
class sparrow extends bird{
    public void fly(){
        System.out.println("sparrow fly");
    }
    public void eat(){
        System.out.println("sparrow eat flesh");
    }
}
 //abstract class can contain concrete and abstract methods
 //concrete methods : A method with implementation
 //abstrct methods  : A method without implementation
abstract class eagle extends bird{
    public void fly(){
        System.out.println("Eagle fly very high in the sky");
    }
    public abstract void eat();
}
class goldenEagle extends eagle{
    public void eat(){
        System.out.println("golden eagle eats good tasty foood");
    }

}
class serpentEagle extends eagle{
    public void eat(){
        System.out.println("golden eagle eats good tasty foood");
    }
}
class sky{
    public void allowbird(bird su){
        su.fly();
        su.eat();
        System.out.println();
    }

}

// Note:
//  1. abstract class contains concrete methods and abstract methods, so we say 
//     through abstract class 100% abstraction can't be achieved.
//  2. To achieve 100% abstraction, we need to go for "interfaces"
public class birdExample {
    public static void main(String[] args) {
        sky s=new sky();
        s.allowbird(new crow());
        s.allowbird(new sparrow());
        s.allowbird(new goldenEagle());
        s.allowbird(new serpentEagle());
       // s.allowbird(new crow());
    }
}
