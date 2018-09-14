
import java.util.Scanner;
public class sumnum {

    public static void main(String [] args){

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int sum = 0, k;
        for(int i = 1; i <= n; ++i){
            k = scanner.nextInt();
            sum = sum + k;

        }
        System.out.println(sum);
    }
}
