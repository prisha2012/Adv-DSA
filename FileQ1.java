import java.io.*;
public class FileQ1 {
    public static void main(String[] args) {
        
    
    try{
        BufferedReader br=new BufferedReader(new FileReader("data.txt"));
        String line;
        int wordCount=0;
        while((line=br.readLine())!=null){
            String[] words=line.split("\\s+");
            wordCount+=words.length;
        }
        br.close();
        System.out.println("Total words: "+wordCount);
    }
    catch(IOException e){
        System.out.println("An error occurred: "+e.getMessage());
    }
}
}

