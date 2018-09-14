import java.util.Scanner;

public class ifelse {

    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n % 2 != 0 || n % 2 == 0 && n >= 6 && n <= 20){
            System.out.println("weird");
        }
        else if(n % 2 == 0 && n >=2 && n <= 5 || n % 2 == 0 && n > 20){
            System.out.println("not weird");
        }
    }
}
