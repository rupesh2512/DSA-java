package Oops;
class sample{
    public void method(string s){
        System.out.println("String");
    }
    public void method(StringBuffer s){
        System.out.println("String Buffer");
    }
    public void method(Object o){
        System.out.println("object");
    }
}

public class stringAndStringbuffer {
    public static void main(String[] args) {
        sample s=new sample();
        s.method(new string()); //string call will be held here
        s.method(new StringBuffer("Sachin")); //string buffer
      //  s.method(null); it will give error(Ambigious method call)
    }
}
