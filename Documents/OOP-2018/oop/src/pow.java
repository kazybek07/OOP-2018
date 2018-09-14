import java.util.Scanner;
public class pow {

    static double power(double a, double b){
        return Math.pow(a,b);
    }
    public static void main(String [] args){
        double a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println(power(a,b));
    }
}
