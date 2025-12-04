import java.util.*;
public class exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            int prodid=Integer.parseInt(s);
            System.out.println(prodid);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error");
        }
        System.out.println("program continue");
    }
}
