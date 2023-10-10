import java.io.File;
import java.io.IOException;


public class PersonFile {
    public static void createFile() throws IOException {
        File dir = new File("C://temporary");
        dir.mkdirs();
        File newFile = new File(dir, "file.txt");
        newFile.createNewFile();


    }

    public static void addToFile(String str)  {

    }
}
