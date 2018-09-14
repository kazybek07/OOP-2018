import java.util.Scanner;
public class even {

    public static void main(String [] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        for(int i = a; i <= b; ++i){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
