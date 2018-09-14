import java.util.Scanner;


public class apple1 {

    public static void main(String [] args){
        int n;
        int k;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();

        int res = k / n;

        System.out.println(res);

    }
}
