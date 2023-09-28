import java.util.List;
import java.util.ArrayList;

public class PascalProblem {
    
    public static void main(String args[]){
        List<List<Integer>> result = generate(5);
        System.out.println(result);
    }

     public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<numRows ; i++){
            List<Integer> arrayValue = new ArrayList<>();
            for(int j = 0; j<= i; j++){
                arrayValue.add(j);
            }
            result.add(arrayValue);
        }
        return result;
    }
}
