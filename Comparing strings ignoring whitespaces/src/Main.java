import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text0= scanner.nextLine();
        String text00= scanner.nextLine();

        String text1 = text0.replace(" ", ""); // "THESIMPLETEXTSTRING"

        String text2 = text00.replace(" ", "");
        if(text1.equals(text2)){
            System.out.println("true");


        }else{
            System.out.println("false");


        }
    }
}