import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class PersonFile {
    public static void addToFile(String str)  {
        try(FileOutputStream fos=new FileOutputStream("file.txt"))
        {
            byte[] buffer = str.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
