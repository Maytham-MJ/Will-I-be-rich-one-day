import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Age: ");
        String answer = scan.nextLine();

        System.out.println("What city you live in: ");
        String answer2 = scan.nextLine();

        switch (answer2) {
            case "miami", "LA", "san diego" -> System.out.println("You will be rich!");
            default -> {
                System.out.println("Sorry, geography matter. You may want to move to Miami!");
            }
        }

    }
}