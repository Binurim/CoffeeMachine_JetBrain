import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                if (num == 0) {
                    break;
                }
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        } }
}