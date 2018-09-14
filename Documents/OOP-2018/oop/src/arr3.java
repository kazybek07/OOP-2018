import java.util.Scanner;
public class arr3 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = scanner.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i < n; ++i){
            if(a[i] > 0){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
