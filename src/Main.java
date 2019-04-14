import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static ArrayList<String> names;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        names = new ArrayList<String>(5);
        String name;

        for (int i=0; i<5; i++) {
            System.out.print("Enter name " + i + " : ");
            name = scanner.nextLine();
            names.add(name);

            if (names.size() > 1) {
                if (names.get(i).equals(names.get(i-1))) {
                    System.out.println("Reenter name");
                    names.remove(i);
                    i--;
                }
            }
        }

        System.out.println("Show : ");
        showArray(names);

    }


    public static void showArray(ArrayList<String> names) {
        for (int i=0; i<names.size(); i++) {
            System.out.print(names.get(i) + " , ");
        }
    }
}
