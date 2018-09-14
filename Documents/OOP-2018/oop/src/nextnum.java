
import java.util.Scanner;

import static java.lang.Math.sqrt;
public class nextnum {

    public static void main (String [] args) {

    Scanner scan = new Scanner(System.in);
    int a;
    a = scan.nextInt();

    int b;
    int c;
    b = a+1;
    c = a-1;

    System.out.println("The next number for the number " + a + " is " + b + ".");
    System.out.println("The previous number for the number " + a + " is " + c + ".");

    }

}
