import java.util.*;

interface Stringfn{
    String apply(String s);
}
public class lambdafn {
    public static void format(String message,Stringfn f) {
        String result=f.apply(message);
        System.out.println(result);
        
    }
    public static void main(String[] args) {
        
        String message="Are you there";

        Stringfn excited=(s)-> s+"!";
        Stringfn clarification=(s)-> s+"?";
        Stringfn confirmation=(s)-> s.toUpperCase();

        format(message, excited);
        format(message, clarification);
        format(message, confirmation);

    }
}
