import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class PersonFile {
    public static void addToFile(String str)  {

        try {
            FileWriter writer = new FileWriter("c:\\temporary\\file.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(str+"\n");
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
