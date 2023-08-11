import java.util.Scanner;

public class LinearSearchAlgo2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] names = {"Kasun","Ruwan","Amal","Supun","Upul","Nimal"};

        myLoop:
        do {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    System.out.println(name + " Found at index: " + i);
                    continue myLoop;
                }  
            }
            System.out.println("Name not found!");
        } while (true);
    }
}
