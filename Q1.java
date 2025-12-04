//ArrayList
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            list.add(sc.nextLine());
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
