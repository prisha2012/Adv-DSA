import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ag=sc.nextLine();
        int counteven=0,countodd=0;

        for(int i=0;i<ag.length()-1;i++){
            if(ag.charAt(i)=='a'||ag.charAt(i)=='e'||ag.charAt(i)=='i'||ag.charAt(i)=='o'||ag.charAt(i)=='u'){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println(counteven);
        System.out.println(countodd);

    }
}
