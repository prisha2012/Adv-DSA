import java.util.*;
public class exception2 {
    public static void main(String[] args) {
        String[] languages=new String[3];
        Object[] objects=languages;

        try{
            objects[0]="English";
            objects[1]="spanish";
            objects[2]=42;

        }catch(ArrayStoreException e){
            System.out.println("Error");
        }
    }
}
