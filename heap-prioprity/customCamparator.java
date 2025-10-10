import java.util.Arrays;

class student implements Comparable<student>{
    int roll;
    double percentage;
    String name;
    student(int roll,double percentage,String name){
        this.roll = roll;
        this.percentage = percentage;
        this.name = name;
    }
    public int compareTo(student s){
        return (int) (this.name.charAt(0)-s.name.charAt(0));
    }
}

// customCamparator
// 
public class customCamparator {
    public static void main(String[] args) {
        student[] s = new student[4];
        s[0] = new student(1, 90, "kunal");
        s[1] = new student(2, 80, "Rachit");
        s[2] = new student(3, 70, "kshitij");
        s[3] = new student(4, 60, "ram Prakash jha");
        for(int i=0;i<4;i++){
            System.out.println(s[i].roll+" "+s[i].percentage+" "+s[i].name);
        }
        Arrays.sort(s);
        for(int i=0;i<4;i++){
            System.out.println(s[i].roll+" "+s[i].percentage+" "+s[i].name);
        }
    }
}
