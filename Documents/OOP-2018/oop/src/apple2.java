
import java.util.Scanner;

public class apple2 {

    public static void main(String [] args){

        int n;
        int k;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        k = scan.nextInt();
        int c = k / n;

        int res = k - c * n;

        System.out.println(res);
    }
}
