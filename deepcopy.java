import java.io.*;

class Document{
    private String title;
     private String author;
    private int year;
     public Document(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }
      public Document(Document d) {
        title = d.title;
        author = d.author;
        year = d.year;
    }
     public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
     public void print(String label) {
        System.out.println(label + " -> Title: " + title + ", Author: " + author + ", Year: " + year);
    }

}
public class deepcopy {
    public static void main(String[] args) {
        try(BufferedReader f=new BufferedReader(new FileReader ("docs.txt"))){
            String line;
            while((line=f.readLine())!=null){
                String[] parts=line.split(",");
                String t=parts[0].trim();
                String a=parts[1].trim();
                int y=Integer.parseInt(parts[2].trim());
                Document o=new Document(t,a,y);
                Document c=new Document(o);
                o.print("Orignal");
                c.print("copy");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
