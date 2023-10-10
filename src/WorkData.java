
import java.util.PriorityQueue;

public class WorkData {
    public static String[] put(String input){
        String [] arr = input.split(" ");
        return arr;

    }
    public static void get(PriorityQueue queue, Toys[] arr) {

        String str = "Покупатель "+(String) queue.remove()+" получает " + getFrequency(arr) + "\n";
        PersonFile.addToFile(str);
    }

    private static String getFrequency(Toys[] arr){
        int r =  (int) (Math.random() * 10);
        if(r<3){
            return arr[0].getName();
        } else if(r<5){
            return arr[1].getName();
        } else return arr[2].getName();
    }

}





