import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        boolean endssWith = text.endsWith("burg");
        System.out.println(endssWith);

    }
}