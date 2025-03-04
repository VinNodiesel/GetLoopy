import java.util.Random;
import java.util.Scanner;

public class Die {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int rollCount = 0;

        System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
        System.out.println("-----------------------------------------------");

        while (true) {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int die3 = rand.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            rollCount++;

            System.out.printf("%-8d%-8d%-8d%-8d%-8d\n", rollCount, die1, die2, die3, sum);

            if (die1 == die2 && die2 == die3) {
                System.out.println("Triple rolled! All dice have the same value.");
                break;
            }

            System.out.print("Do you want to roll again? (y/n): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                break;
            }
        }
        scanner.close();
    }
}
