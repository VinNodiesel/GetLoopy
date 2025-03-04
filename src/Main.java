public class Main {
    public static void main(String[] args) {
        // Outer loop for the rows
        for (int i = 0; i < 5; i++) {
            // Inner loop for the columns (printing stars in each row)
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            // After printing all stars in a row, move to the next line
            System.out.println();
        }
    }
}
