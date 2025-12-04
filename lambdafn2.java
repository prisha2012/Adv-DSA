import java.util.*;
import java.io.IOException;
import java.nio.file.*;
interface FileWritter {
    void write(String content,Path path)throws IOException;


    
}
public class lambdafn2 {
    public static void main(String[] args) {
        FileWritter writer=(content,path)->Files.writeString(path, content);
        try{
            writer.write("Hello",Paths.get("Output.txt"));
            System.out.println("done");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
