import java.util.HashMap;
import java.util.Map;
public class NoRepeatCaracter {
    
    public static Map<Character, Integer> findRepeatCaracter(String str){

        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0; i < str.length() ; i++){
           char c = str.charAt(i);
           result.compute(c, (key, v)-> (v==null) ? 1 : v++);
        }
        return result;
    }

    public static void main(String[] args){
        
        Map<Character, Integer> result = findRepeatCaracter("salyabbo");
        Integer repeat = result.get("a");
        System.out.println(repeat);
    }
}
