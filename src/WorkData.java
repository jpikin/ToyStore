import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;

public class WorkData {
    public static String[] put(String input){
        String [] arr = input.split(" ");
        return arr;

    }
    public static void get(PriorityQueue queue, Toys[] arr) throws IOException {

        String str = "Покупатель "+(String) queue.remove()+" получает " + getFrequency(arr) + "\n";
        PersonFile.addToFile(str);
    }

    private static String getFrequency(Toys[] arr){
        for (Toys t: arr) {

        }
        return "1";
    }
}





