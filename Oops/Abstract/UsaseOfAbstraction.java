package Oops.Abstract;
abstract class plane {
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}
class FighterPlane extends plane{
    public void takeOff(){
        System.out.println("Fighter plane took off");
    }
    public void fly(){
        System.out.println("Fighter plane fly");
    }
    public void land(){
        System.out.println("Fighter plane landed");
    }
}
class PassengerPlane extends plane{
    public void takeOff(){
        System.out.println("PassengerPlane took off");
    }
    public void fly(){
        System.out.println("PassengerPlane fly");
    }
    public void land(){
        System.out.println("PassengerPlane landed");
    }
}


class CargoPlane extends plane{
    public void takeOff(){
        System.out.println("CargoPlane took off");
    }
    public void fly(){
        System.out.println("CargoPlane fly");
    }
    public void land(){
        System.out.println("CargoPlane landed");
    }
}
class Airport{
//TruePolymorphism
    public void allowPlane(plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
// Rules of abstract accessmodifier in java
// ++++++++++++++++++++++++++++++++++++++++
//      1. If a class contains atleast one abstract method, then mark the class as 
//         "abstractR".
//      2. abstract class can't be instantiated.
//      3. for an abstract class, we can create a reference,but not the object.
//      4. Inside abstract class, we can write concrete methods also.
//      5. If a parent class is abstract, then compulsorily the child class should give 
//         implementation for all the abstract
//         methods otherwise the child class also would become "abstract".
//      6. Even if the class doesn't contain abstract methods/concrete method still we can 
//         mark the empty class as "abstract".

public class UsaseOfAbstraction {
    public static void main(String[] args) {
        PassengerPlane p = new PassengerPlane();
        CargoPlane c= new CargoPlane();
        FighterPlane fi =  new FighterPlane();
        Airport a= new Airport();
        a.allowPlane(fi);
        a.allowPlane(p);
        a.allowPlane(c);
        
    }
}

