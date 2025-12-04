import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        int[] marks=new int[5];
        marks[0]=3;
        marks[0]=3;
        marks[0]=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index;");
        int ind=sc.nextInt();
        System.out.println("leave number");
        int number=sc.nextInt();
        try{
            System.out.println(marks[ind]);
            System.out.println(marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println(" failed");
            System.out.println(e);
        }
                catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" failed");
            System.out.println(e);
        }
                catch(Exception e){
            System.out.println(" failed");
            System.out.println(e);
        }
    }
}
