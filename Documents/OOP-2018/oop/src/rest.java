import java.util.Scanner;
public class rest {

    public static void main(String [] args){
        int a,b,c,d;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        for(int i = a; i <= b; ++i){
            if(i%d == c){
                System.out.print(i + " ");
            }
        }

    }
}
