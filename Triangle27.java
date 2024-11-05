import java.util.Scanner;
public class Triangle27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 5;
        for (int h = 1; h <= N; h++) {
            if(h==1 || h==N);

                for (int i = 1; i <= h; i++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
