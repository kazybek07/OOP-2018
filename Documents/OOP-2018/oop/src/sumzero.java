import java.util.Scanner;
public class sumzero {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int k;
        int cnt = 0;
        for(int i = 1; i <= n; ++i){
            k = scanner.nextInt();
            if(k == 0){
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}
