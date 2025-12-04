class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class Qexception {
    public static void main(String[] args) {
        try{
            int result =divide(10,0);
            System.out.println("Result: "+result);
        }catch(DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
        }
    
    static int divide(int a,int b) throws DivisionByZeroException {
        if(b==0){
            throw new DivisionByZeroException("Cannot divide by zero");
        }
            return a/b;
        }
}
