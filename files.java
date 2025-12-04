import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files {
  public static void main(String[] args) {
    /* 
    File myFile= new File("cwh11file.txt");
    try{
    myFile.createNewFile();
    }
    catch(IOException e){
        System.out.println("unable");
        e.printStackTrace();
    }
        */
        /* 
        try{
        FileWriter filewriter=new FileWriter("cwh11file.txt");
          filewriter.write("this is the first hava file");
          filewriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
            */
            /* 
   File myFile=new File("cwh11file.txt");
   try{
    Scanner sc=new Scanner(myFile);
    while(sc.hasNextLine()){
        String line=sc.nextLine();
        System.out.println(line);
    }
    sc.close();
   }
   catch(FileNotFoundException e){
    e.printStackTrace();
   }
*/
 File myFile=new File("cwh11file.txt");
 if(myFile.delete()){
    System.out.println("deleted");
 }
 else{
    System.out.println("problem");
 }
        
  }  
}
