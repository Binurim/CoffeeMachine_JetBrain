import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int lastNumber = number;

        boolean as = true;
        boolean ds = true;

        while (number != 0) {

            if (number > lastNumber) {
                ds = false;
            } else
            if (number < lastNumber) {
                as = false;
            }

            lastNumber = number;
            number = scanner.nextInt();

        }

        if (as || ds) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}