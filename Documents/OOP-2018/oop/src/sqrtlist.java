import java.util.Scanner;
public class sqrtlist {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int i = 1;
        while (i <= Math.sqrt(n)){
            if(Math.sqrt(n) != 0){
                Math.floor(Math.sqrt(n));

            }
            i++;

           System.out.println(Math.pow(i,2));

        }

    }
}
