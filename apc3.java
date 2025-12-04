class InelligibleException extends RuntimeException{
public InelligibleException(String m){
    super(m);
}
}
public class apc3 {
    public static void validate(int marks) throws InelligibleException{
        if(marks<35){
            throw new InelligibleException("Fail");
        }
        System.out.println("Pass");
    }
    public static void main(String[] args) {
        try{
            validate(30);

        }catch(InelligibleException e){
            System.out.println(e.getMessage());
        }
    }
}
