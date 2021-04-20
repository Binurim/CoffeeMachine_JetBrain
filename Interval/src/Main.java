import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i = scanner.nextLong();
        if((-15 < i && i <= 12)|| (-14 < i && i< 17)|| 19 <= i){
            System.out.println("True");
        }else{
            System.out.println("False");

        }
    }
}
