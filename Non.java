import java.util.Scanner;

public class Non {
    public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
        String ag=sc.nextLine();
        StringBuilder al=new StringBuilder(ag);
        char an='a';
        String ah="";
        String uniqueString="";

        for(int i=0;i<al.length()-1;i++){
            if(al.charAt(i)!=al.charAt(i+1)){
                an=al.charAt(i+1);
                break;
            }
            
        }
        al.append(" ");
        for(int i=0;i<al.length()-1;i++){
            if(al.charAt(i)!=al.charAt(i+1)){
                ah+=al.charAt(i);
            }
            
        }
        for (int i = 0; i < ag.length(); i++) {
            boolean found = false;
            for (int j = 0; j < uniqueString.length(); j++) {
                if (ag.charAt(i) == uniqueString.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueString += ag.charAt(i);
            }
        }
        

        System.out.println(an);
        System.out.println(ah);
        System.out.println(uniqueString);
    }
}
