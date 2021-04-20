import java.util.Scanner;
class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N= scanner.nextInt();
    int b = 1;
    int c = 1;
    while (c <= N) {
        System.out.println(c);
        b++;
        c = b*b;
    }
    }}
