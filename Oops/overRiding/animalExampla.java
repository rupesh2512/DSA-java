package Oops.overRiding;
class animal{
    public void animalSleep(){
        System.out.println(" animal is sleeping");
    }
    public void animaleat(){
        System.out.println(" animal is Eating");
    }
}
class deer extends animal{
    public void animalSleep(){
        System.out.println(" deer is sleeping");
    }
    public void animaleat(){
        System.out.println(" deer grazing is Eating");
    }
}
class lion extends animal{
    public void animalSleep(){
        System.out.println(" lion is sleeping");
    }
    public void animaleat(){
        System.out.println(" lion hunts and  Eat");
    }
}
class Monkey extends animal{
    public void animalSleep(){
        System.out.println(" Monkey is sleeping");
    }
    public void animaleat(){
        System.out.println(" Monkey  snatch and  Eating");
        
    }
    
}
class forest{
    forest(animal a){
        a.animalSleep();
        a.animaleat();
        System.out.println();
    }
}
public class animalExampla {
    public static void main(String[] args) {
        new forest((new lion()));
        new forest((new Monkey()));
        new forest((new deer()));
    }
}
