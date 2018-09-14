import java.util.Scanner;
public class loops {
    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 1; i <= 10; ++i){
            System.out.println(n*i);
        }
    }
}
