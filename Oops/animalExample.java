package Oops;
class animal{
    // int a;
}
class monkey extends animal{

}
class animalapp{
    public void m1(monkey m){
        System.out.println("from monkey version");
    }
    public void m1(animal a){
        System.out.println("from animal version");
    }
}

public class animalExample {
    public static void main(String[] args) {
        monkey m = new monkey();
        animalapp a=new animalapp();
        animal animal=new animal();
        a.m1(m);
        a.m1(animal);
        animal an = new monkey();
        a.m1(an);//an(Animal)
    }
}
