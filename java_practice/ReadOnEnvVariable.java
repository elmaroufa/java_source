package java_practice;

public class ReadOnEnvVariable {
    
    public static void main(String[] args){
     if(args.length > 0){
        String value = System.getenv(args[0]);
        if(value != null){
            System.out.println(args[0].toUpperCase() + " = " + value);
        }else{
            System.out.println("No such environment variable exists");
        }
     }else{
        System.out.println("No argument passed");
     }
    }
}
