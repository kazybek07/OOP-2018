import java.util.Scanner;
public class arr5 {

    public static void main(String [] args){
        int n ;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = scanner.nextInt();
        }
        int k = 0;
        for(int i = 1; i < n -1; ++i){
            if(a[i] * a[i+1] > 0){
                k++;
            }
        }
        if(k > 0){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
