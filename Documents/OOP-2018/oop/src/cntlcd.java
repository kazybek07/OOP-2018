import java.util.Scanner;
public class cntlcd {

    public static void main(String [] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int cnt = 0;
        for(int i = 1; i <= x; ++i)
            if(x%i == 0)
                cnt++;
        System.out.println(cnt);
    }
}
