class MyEmployee{
    private int id;
    private String name;
    public MyEmployee(){
        id=45;
        name="Your name here";
    }
    public MyEmployee(String Myname,int iid){
        id=iid;
        name=Myname;
    }
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public void setId(int i){this.id=i;}
    public int getId(){return id;}

}
public class Main {
    public static void main(String[] args){
      MyEmployee h=new MyEmployee("Codewithharry",2);
      System.out.println(h.getId());
      System.out.println(h.getName());

    }
}