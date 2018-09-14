
import java.util.Scanner;
public class max2 {

    public static void main(String [] args){
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        if(a > b){
            System.out.println("1");
        }
        if(a < b) {
            System.out.println("2");
        }
        if(a == b) {
            System.out.println("0");
        }
    }
}
