import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res=1;
        try{
            res=a/(b-c);
        }
        catch(Exception e){
            System.out.println("File I/O eroor: "+e.getMessage());

        }
    }
}
