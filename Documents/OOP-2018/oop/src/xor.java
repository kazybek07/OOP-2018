import java.util.Scanner;
public class xor {

    static boolean xor(boolean x, boolean y){
        if(x == true && y == false || x == false && y == true){
            return true;
        }
        else
            return false;
    }

    public static void main(String [] args){

        boolean x,y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextBoolean();
        y = scanner.hasNextBoolean();

        System.out.println(xor(x,y));
    }
}
