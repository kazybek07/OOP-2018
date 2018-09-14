import java.util.Scanner;

public class mkad {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int s = 109;
        int v;
        int t;
        v = scan.nextInt();
        t = scan.nextInt();

        int res = Math.abs(s - Math.abs(v*t));
        System.out.println(res);

    }

}
