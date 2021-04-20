import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n<1){
            System.out.println("no army");
        }else if(n<=19){
            System.out.println("pack");   
        }else if(n<=249){
            System.out.println("throng");    
        }else if(n<=999){
            System.out.println("zounds");   
        }else{
            System.out.println("legion");   
            
        }
    }
}
