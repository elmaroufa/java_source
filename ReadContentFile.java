import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class ReadContentFile {
    public static void main(String[] args){
     Path filePathHello = Paths.get("/home/abbo-servoo/Desktop/Formation-personnelle/Java/text.txt");

     try{
        String contents = Files.readString(filePathHello);
        System.out.println(contents);
     }
     catch(IOException err){
            System.out.println(err);
     }
    }
}
