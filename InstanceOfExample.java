public class InstanceOfExample {
    

    public static void main (String[] args){

        Object selectObject = "I am a String";
        
        if(selectObject instanceof String){
            String selectObjectString = (String) selectObject;
            System.out.println(selectObjectString.length());
        }
        if(selectObject instanceof String selectString){
            System.out.println(selectString.length());
        }
    }
}
