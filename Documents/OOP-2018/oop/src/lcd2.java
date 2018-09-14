import java.util.Scanner;
public class lcd2 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        for(int i = 1; i <= x; ++i){
            if(x%i==0){
                System.out.print(i + " ");
            }
        }

    }
}
