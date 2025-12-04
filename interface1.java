interface camera{
    void takesnap();

}

interface wifi{
    
    void connect(String network);
}
class MyCellphone{

    void call(int phone){
        System.out.println("calling"+ phone);
    }
   
}
class Mysmartphone extends MyCellphone implements wifi,camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
       public void connect(String network){
        System.out.println("connecting "+ network);
    }


}

public class interface1 {
    public static void main(String [] args){

    }
}
