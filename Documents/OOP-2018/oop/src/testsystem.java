import java.util.Scanner;

public class testsystem {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();

        if(a == 1 && b == 1 || a != 1 && b != 1){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
