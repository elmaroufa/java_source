import java.util.*;
public class NoRepeatCaracter {
    
    public static Map<Character, Integer> findRepeatCaracter(String str){

        Map<Character, Integer> result = new HashMap<>();
        // for(int i = 0; i < str.length() ; i++){
        //    char c = str.charAt(i);
        //    System.out.println(c);
        //    result.compute(c, (k, v)-> (v==null) ? 1 : ++v);
        // }
        for (char c : str.toCharArray()) {
            result.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println(result.toString());
        return result;
    }

    public static void main(String[] args){
        
        Map<Character, Integer> result = findRepeatCaracter("saly abbo ousmane");
        //int repeat = result.get("b");
        System.out.println(result.toString());
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            
        }
    }
}
