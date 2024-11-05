import java.util.Scanner;;
public class Nomor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=3, bil=1, i=0, n;
        System.out.print("Nilai n: ");
        n = sc.nextInt();
         
        while (i <= n) {
            System.out.print(a+ ", ");
            a += bil;
            bil += 2;
            i++;
        }
    }
}
