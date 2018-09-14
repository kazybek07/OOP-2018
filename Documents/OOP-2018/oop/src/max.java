import java.util.Scanner;


public class max {

    public static void main (String [] args){
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        if(a > b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
}
