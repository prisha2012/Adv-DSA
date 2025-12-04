class VotingInelligibleException extends RuntimeException{
    public VotingInelligibleException(String s){
        super(s);
    }
}
public class apc4 {
    public static void validate(int age) throws VotingInelligibleException
    {
     if(age<18){
        throw new VotingInelligibleException("Not Eligible");
     }  
     System.out.println("Eligble"); 
    }
    public static void main(String[] args) {
        try{
            validate(17);

        }catch(VotingInelligibleException e){
            System.out.println(e.getMessage());
        }
    }
}
