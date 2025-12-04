import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ag=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<ag.length()-1-i;i++){
                if(ag.charAt(i)!=ag.charAt(ag.length()-1-i)){
                    flag=false;
        }
    }
    if(flag){
    System.out.println("Palindrome");
    }
    else{
        System.out.println("Not");
    }
 
}
    }

