import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        ToyStore toyStore = new ToyStore();

        Toys toy1 = new Toys(WorkData.put("1 2 конструктор"));
        Toys toy2 = new Toys(WorkData.put("2 2 робот"));
        Toys toy3 = new Toys(WorkData.put("3 6 кукла"));

        Toys[] toysList = new Toys[3];
        toysList[0]=toy1;
        toysList[1]=toy2;
        toysList[2]=toy3;

        Visitors v1 = new Visitors("Sergey");
        toyStore.getQueque().add(v1.getName());
        Visitors v2 = new Visitors("Boris");
        toyStore.getQueque().add(v2.getName());
        Visitors v3 = new Visitors("Oksana");
        toyStore.getQueque().add(v3.getName());
        Visitors v4 = new Visitors("Olga");
        toyStore.getQueque().add(v4.getName());
        Visitors v5 = new Visitors("Stepan");
        toyStore.getQueque().add(v5.getName());
        Visitors v6 = new Visitors("Aladdin");
        toyStore.getQueque().add(v6.getName());
        Visitors v7 = new Visitors("Svetlana");
        toyStore.getQueque().add(v7.getName());
        Visitors v8 = new Visitors("Elena");
        toyStore.getQueque().add(v8.getName());
        Visitors v9 = new Visitors("Petr");
        toyStore.getQueque().add(v9.getName());
        Visitors v10 = new Visitors("Roman");
        toyStore.getQueque().add(v10.getName());

        PersonFile.createFile();
        WorkData.get(toyStore.getQueque(),toysList);


    }

}
