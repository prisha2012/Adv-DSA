import java.io.*;
import java.util.*;
public class Qfile {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new FileReader("number.txt"));
        String line;
        int sum=0;
        while((line=br.readLine())!=null){
            sum+=Integer.parseInt(line);
        }
        br.close();
        System.out.println("Sum: "+sum);
    }
}
