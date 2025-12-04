class Mythread extends Thread{
    public void run(){
        while(true){
        System.out.println("My thread is running");
    }
}
}
class Mythread1 extends Thread{
    public void run(){
        while(true){
        System.out.println("My thread1 is running");
    }
}
}
public class thread1 {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread1 t2=new Mythread1();
        t1.start();
        t2.start();
    }
}
