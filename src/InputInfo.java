import java.util.Scanner;

public class InputInfo {
    public static int getID() {
        try (Scanner scanner = new Scanner(System.in)) {
            int ID = scanner.nextInt();
            scanner.close();
            return ID;
        }
    }

    public static String getName() {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            scanner.close();
            return name;
        }
    }

    public static Double getFrequency() {
        try (Scanner scanner = new Scanner(System.in)) {
            Double frequency = scanner.nextDouble();
            scanner.close();
            return frequency;
        }
    }
}





