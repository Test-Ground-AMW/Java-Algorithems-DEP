import java.util.Scanner;

public class FindingDuplicateAlgo2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            int duplicate = 0;
            boolean isDuplicate = false;

            System.out.print("Enter a text: ");
            String input = scanner.nextLine();
            char[] text = input.toCharArray();

            for (int i = 0; i < text.length; i++) {
                for (int j = i + 1; j < text.length-i; j++) {
                    if (text[i] != ' ') {
                        if (text[i] == text[j]) {
                            duplicate++;
                            isDuplicate = true;
                        }
                    } else isDuplicate = false;
                }
                if (isDuplicate) {
                    System.out.println(text[i] + " - " + duplicate);
                }
            }

        } while (true);

    }
}
