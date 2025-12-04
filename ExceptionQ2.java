class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
    
public class ExceptionQ2 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 ){
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Valid age: " + age);
        }
    public static void main(String[] args) {
    try{
        checkAge(-5);
    }catch(InvalidAgeException e){
        System.out.println(e.getMessage());
    }
    }
}

