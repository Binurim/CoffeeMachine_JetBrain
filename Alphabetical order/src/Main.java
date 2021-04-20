import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean there= true;

        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        for (int i = 0; i < array.length-1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                there = false;
                break;
            }

        }
        if (there) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }}}
