import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class sum100 {

    public static void main(String [] args) {


        int x, s = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 100; ++i) {
            x = scanner.nextInt();
            s = s + x;
        }

    }
}
