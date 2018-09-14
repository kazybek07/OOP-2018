import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        int a, b;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        for (int i = 1; i * i <= b; i++) {
            if (i * i >= a) {
                System.out.print(i * i + " ");
            }

        }

    }
}
