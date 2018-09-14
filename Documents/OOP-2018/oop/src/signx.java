
import java.util.Scanner;
public class signx {

    public static void main (String [] args){

        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a > 0){
            System.out.println(1);
        }
        else if(a < 0){
            System.out.println(-1);
        }
        else if(a == 0){
            System.out.println(0);
        }
    }
}
