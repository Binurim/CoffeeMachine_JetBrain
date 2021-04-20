import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        boolean there= false;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int number = scanner.nextInt();
        for(int i=0;i<array.length;i++){
            if (number==array[i]){
                there=true;
                break;
            }
        }
        if (!there) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}