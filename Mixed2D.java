import java.io.*;
import java.util.*;

public class Mixed2D {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String file=sc.nextLine();
        int count=0;
        try(BufferedReader f=new BufferedReader(new FileReader(file))){
            String line;
            while((line=f.readLine())!=null){
                String[] seats=line.trim().split("\\s+");
                for(String n:seats){
                    if(n.equals("0")){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
