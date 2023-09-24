package java_practice;
import java.io.*;

public class input_keyboard {
    
    public static void main (String[] args){
       
        BufferedReader readIn = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String numberAsString = "";
        long numberAsLong = 0;
        boolean numberIsValid = false;
        do{
            System.out.println("Please enter a number");
            try{
                numberAsString = readIn.readLine();
                System.out.println("You entered: " + numberAsString);
            } catch(IOException ex){
                System.out.println(ex);
            }
            try{
                numberAsLong = Long.parseLong(numberAsString);
                numberIsValid = true;
            }catch(NumberFormatException nfe){
                System.out.println("Not a number");
            }

        }while(numberIsValid == false);
    }
}
