
package Oops;
class employe{
    private String eid;
    private String name;
    private int age;
    private String address;

    public void seteid(String id){
        this.eid=id;

    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setaddress(String addr){
        this.address=addr;
    }
    public String geteid(){
        return eid;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getaddress(){
        return address;
    }
}



public class employeWeb {
    public static void main(String[] args) {
        employe s1=new employe();
        s1.seteid("123rt");
        s1.setname("kunal");
        s1.setage(68);
        s1.setaddress("Koyla mohan ,vaishali ,bihar");
        System.out.println(s1.geteid());
        System.out.println(s1.getname());
        System.out.println(s1.getage());
       System.out.println( s1.getaddress());

    }
}
