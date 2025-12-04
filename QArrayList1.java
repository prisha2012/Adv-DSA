import java.util.*;

public class QArrayList1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Aman");
        list.add("Prisha");
        list.add("Riya");
        list.add("Neha");

        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
