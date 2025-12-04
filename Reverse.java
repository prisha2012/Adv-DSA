// import java.util.Scanner;
// public class Reverse{
//     public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      String ag=sc.nextLine();
//      StringBuilder ah=new StringBuilder(ag);
//      for(int i=0;i<ah.length()/2;i++){
//         int front=i;
//         int back=ah.length()-1-i;

//         char frontchar=ah.charAt(front);
//         char backchar=ah.charAt(back);

//         ah.setCharAt(front,backchar);
//         ah.setCharAt(back,frontchar);

//      }
//      System.out.println(ah);
//     }
// }


import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ag=sc.nextLine();
        StringBuilder ah=new StringBuilder(ag);

        for(int i=0;i<ah.length()-1-i;i++){
            int front=i;
            int back=ah.length()-1-i;

            char frontchar=ah.charAt(front);
            char backchar=ah.charAt(back);

            ah.setCharAt(front, backchar);
            ah.setCharAt(back,frontchar);
        }
        System.out.println(ah);
    }
}