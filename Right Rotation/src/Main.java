import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int number = scanner.nextInt();
        int n = number % arr.length;

        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j;
            String last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}