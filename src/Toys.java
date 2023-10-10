import java.util.Scanner;

public class Toys {
    private String ID;
    private String name;
    private String frequency;
    public Toys(String [] arr) {
        this.ID = arr[0];
        this.name = arr[2];
        this.frequency = arr[1];
    }
public String getName(){
        return name;
}


}
