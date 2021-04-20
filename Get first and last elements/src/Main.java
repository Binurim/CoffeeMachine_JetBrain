import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] numbers) {
        int firstNum = numbers[0];
        int lastNum = numbers[numbers.length-1];

        return new int[]{firstNum, lastNum};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}