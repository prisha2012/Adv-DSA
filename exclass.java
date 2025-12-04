import java.util.Scanner;

class MyExcep extends Exception{

public String toString(){
    return super.toString()+"I am toString()";
}
public String getMessage(){
    return super.getMessage()+ "I am getMessage()"; 
}
 }
 public class exclass {
        public static void main(String[] args) {
        int a;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            if(a<99){
                try{
                throw new MyExcep();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
    }
}
