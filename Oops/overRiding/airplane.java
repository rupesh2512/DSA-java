package Oops.overRiding;
class plane {
    public void takeOff(){
        System.out.println("plane took off");
    }
    public void fly(){
        System.out.println("plane fly");
    }
    public void land(){
        System.out.println("plane landed");
    }
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

public class airplane {
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
