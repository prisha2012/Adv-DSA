import java.util.*;
class Heap<T extends Comparable<T>> {

    private ArrayList<T> heap;
    public Heap(){
        heap=new ArrayList<>();
    }
    public void swap(int first,int second){
        T temp=heap.get(first);
        heap.set(first,heap.get(second));
        heap.set(second,temp);

    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return 2*index+1;
    }
    private int right(int index){
        return 2*index+2;
    }
    public void insert(T val){
        heap.add(val);
        upheap(heap.size()-1);

    }
    private void upheap(int index){
        if(index==0)return;
        int p=parent(index);
        if(heap.get(index).compareTo(heap.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }
    public T remove(){
        if(heap.isEmpty()){
            throw new NoSuchElementException();
        }
        T temp=heap.get(0);
        T last=heap.remove(heap.size()-1);
        if(!heap.isEmpty()){
            heap.set(0,last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);
        if(left<heap.size() && heap.get(min).compareTo(heap.get(left))>0){
            min=left;
        }
        if(right<heap.size() && heap.get(min).compareTo(heap.get(right))>0){
            min=right;
        }
        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }
    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data=new ArrayList<>();
        while(!heap.isEmpty()){
            data.add(this.remove());

        }
        return data;
    }
}
public class Main1{
public static void main(String[] args) throws Exception {
        Heap<Integer> heap=new Heap<>();
        heap.insert(34);
        heap.insert(12);
        heap.insert(5);
        heap.insert(78);
        heap.insert(23);
        ArrayList list=heap.heapSort();
        System.out.println(list);
        System.out.println(heap.remove());


    }

}
