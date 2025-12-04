import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            list.add(sc.nextInt());
        }
        int max=list.get(0);
        int min=list.get(0);

        for(int i:list){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
