public class queueaeeay {
    public static class queueA{
      int f =-1;
      int r=-1;
      int size=0;
      int[] arr=new int[100];
       public void add(int val) {
        if(r==arr.length-1){
            System.out.println("Queue is full!");
            return;
        }
        if(f==-1) f=r=0;
        else{
            arr[++r] = val;

        }
    }
    public int remove(){
       if(size==0){
        System.out.println("Queueis empty");
       }
        f++;
        size--;
        return arr[f-1];

    }
        public int peek(){
       
        return arr[f];

    }
    public boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    public void dispaly(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        else 
    }
    }
    public static void main(String[] args) {
        
    }
}
