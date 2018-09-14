import java.util.Scanner;
public class arr1 {
    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i){

            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; ++i){
            if(i % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}
