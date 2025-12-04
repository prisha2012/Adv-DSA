import java.util.*;
class newStudent implements Comparable<newStudent>{
    int marks;
    String name;
    newStudent(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
    public String toString(){
        return this.name+" : "+this.marks;
    }
    public int compareTo(newStudent other){
        if(this.marks==other.marks){
            return this.name.compareTo(other.name);
        }
        return this.marks-other.marks;
    }
    public boolean equals(Object o){
        if(o instanceof newStudent) {

            newStudent that=(newStudent)o;
            if(this.marks==that.marks&&(this.name.compareTo(this.name))==0) return true;
            return false;
        }
            
                return false;
            
          

    }
}
public class Qpriorityq {
    public static void main(String[] args) {
        PriorityQueue<newStudent> pq=new PriorityQueue<>();
        newStudent s1=new newStudent(90,"A");
        pq.offer(new newStudent(90,"A"));
        pq.offer(new newStudent(70,"B"));
        pq.offer(new newStudent(80,"C"));
        System.out.println(pq.contains(s1));
    }
}
