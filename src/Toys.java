
public class Toys {
    private String ID;
    private String name;
    private int frequency;
    public Toys(String [] arr) {
        this.ID = arr[0];
        this.name = arr[2];
        this.frequency = Integer.parseInt(arr[1]);
    }
    public String getName(){
        return name;
}
    public void setFrequency(int frequency){
        this.frequency = frequency;
    }


}
