package Oops;
class person{
    public String name;
    public String address;
    public int age;
    public int adharNo;
}
class students extends person{
    public int marks;
    public char grade;
    students(String name,String address,int age,int i,int marks,char grade){
        this.name=name;
        this.address=address;
        this.age=age;
        this.adharNo=i;
        this.marks=marks;
        this.grade=grade;

    }
    public void dis(){
        System.out.println("NAME    is :: "+name);
        System.out.println("aDDRESS is :: "+address);
        System.out.println("age    is  :: "+age);
        System.out.println("addhar  is :: "+adharNo);
        System.out.println("marks   is :: "+marks);
        System.out.println("grade   is :: "+grade);
    }
}

public class inheratance {
    public static void main(String[] args) {
    students s1=new students("ram","benipur",45,123,67,'a');
    s1.dis();
    }
    
}
