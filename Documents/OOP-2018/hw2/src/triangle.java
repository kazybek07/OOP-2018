import java.util.Scanner;
public class triangle {
    int width;

public triangle(int width){

    this.width = width;
}

public String toString(){
    String s = "";
    for(int i = 0; i < width; ++i){
        for(int j = 0; j <= i; ++i){
            s = s + "[*]";
        }
        s = s + "\n";
    }
    return s;
}

}
class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        triangle small = new triangle(scanner.nextInt());
        System.out.print(small.toString());
    }
}
