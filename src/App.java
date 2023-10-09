

public class App {
    public static void main(String[] args) {

        ToyStore toyStore = new ToyStore();

        Toys toy1 = new Toys(WorkData.put("1 2 конструктор"));
        Toys toy2 = new Toys(WorkData.put("2 2 робот"));
        Toys toy3 = new Toys(WorkData.put("3 6 кукла"));

        Toys[] toysList = new Toys[3];
        toysList[0]=toy1;
        toysList[1]=toy2;
        toysList[3]=toy3;

        Visitors v1 = new Visitors("Sergey");
        toyStore.getQueque().add(v1);
        Visitors v2 = new Visitors("Boris");
        toyStore.getQueque().add(v2);
        Visitors v3 = new Visitors("Oksana");
        toyStore.getQueque().add(v3);
        Visitors v4 = new Visitors("Olga");
        toyStore.getQueque().add(v4);
        Visitors v5 = new Visitors("Stepan");
        toyStore.getQueque().add(v5);
        Visitors v6 = new Visitors("Aladdin");
        toyStore.getQueque().add(v6);
        Visitors v7 = new Visitors("Svetlana");
        toyStore.getQueque().add(v7);
        Visitors v8 = new Visitors("Elena");
        toyStore.getQueque().add(v8);
        Visitors v9 = new Visitors("Petr");
        toyStore.getQueque().add(v9);
        Visitors v10 = new Visitors("Roman");
        toyStore.getQueque().add(v10);

        System.out.println(toyStore.getQueque());


    }

}
