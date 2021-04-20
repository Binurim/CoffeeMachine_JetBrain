import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        int bridgeHeight;

        int j = 0;
        int i=0;

        for (; i <  noOfBridges; i++) {
            bridgeHeight= scanner.nextInt();
            j=i+1;
            if ( bridgeHeight<=busHeight) {
                System.out.println("Will crash on bridge " + j);
                break;
            }
        }
        if (i== noOfBridges){
            System.out.println("Will not crash");
        }

    }
}

