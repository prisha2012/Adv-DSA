import java.util.*;

class TreePiece {
    int number;
    TreePiece leftSide;
    TreePiece rightSide;

    TreePiece(int number) {
        this.number = number;
    }
}

public class G15test {
    
    public List<Integer> goInOrder(TreePiece startingPoint) {
        List<Integer> answerList = new ArrayList<>();
        walkThrough(startingPoint, answerList);
        return answerList;
    }

    private void walkThrough(TreePiece part, List<Integer> collector) {
        if (part != null) {
            walkThrough(part.leftSide, collector);    
            collector.add(part.number);               
            walkThrough(part.rightSide, collector); 
        }
    }

    public static void main(String[] args) {
       
        TreePiece root = new TreePiece(1);
        root.rightSide = new TreePiece(2);
        root.rightSide.leftSide = new TreePiece(3);

        G15test helper = new G15test();
        List<Integer> result = helper.goInOrder(root);

        System.out.println(result); 
    }
}
