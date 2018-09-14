import java.util.Scanner;
public class arr4 {
    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int cnt = 0;
        for(int i = 1; i < n; i++){
            if(a[i] > a[i - 1]){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
