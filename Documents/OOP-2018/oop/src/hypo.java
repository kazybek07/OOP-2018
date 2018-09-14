
import java.util.Scanner;

import static java.lang.Math.sqrt;


public class hypo {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        int a;
        int b;

        a = input.nextInt();
        b = input.nextInt();

        double c = sqrt(a*a + b*b);

        System.out.print(c);

    }
}
