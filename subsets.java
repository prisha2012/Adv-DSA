void subsets(int[] arr, int i, List<Integer> list){
    if(i == arr.length){
        System.out.println(list);
        return;
    }

    list.add(arr[i]);
    subsets(arr, i+1, list);

    list.remove(list.size()-1);
    subsets(arr, i+1, list);
}
public class subsets {
    
}
