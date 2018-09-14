
import java.util.Scanner;
public class lcd {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();


        for(int i = 2; i <= x; ++i){

            if(x%i==0){
                System.out.println(i);
            }
            if(x%i==0){
                break;
            }

        }
    }
}
