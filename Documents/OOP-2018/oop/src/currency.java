import java.util.Scanner;
public class currency {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double a;
        a = scanner.nextDouble();
        double tenge = a / 0.0027;
        double rub = a / 0.015;
        System.out.println("Kazakhstan:" + tenge);
        System.out.println("Russia:" + rub);
    }
}
