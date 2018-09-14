import java.util.Scanner;

public class year {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int n;
        n = scan.nextInt();
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
