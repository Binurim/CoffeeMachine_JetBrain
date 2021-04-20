import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        long b =scn.nextLong();
        long multiply =1;

        for (long i = a; i < b; i++) {
            multiply *= i;
        }
        System.out.println(multiply);
    }
}
