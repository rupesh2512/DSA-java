package Oops.Abstract;
abstract class person{
    String name;
    int age;
    float height;
    person(String name,int age,float height){
        this.name =name;
        this.age = age;
        this.height =height;
    }
}
class student extends person{
    int marks;
    float avg;
    student(String name,int age,float height,int marks,double d){
        //To call parameterised consturctor of parent from child class
        super(name,age,height);
        this.marks = marks;
        this.avg   = avg;
    }
    public void display(){
        System.out.println("Name   is :: "+name);
        System.out.println("Age    is :: "+age);
        System.out.println("Height is :: "+height);
        System.out.println("Marks  is :: "+marks);
        System.out.println("Avg    is :: "+avg);
        }

}

public class UseOfConstructor {
    public static void main(String[] args) {
        student s=new student("kunal", 022, 06,890, 90.2);
        s.display();
    }
}
