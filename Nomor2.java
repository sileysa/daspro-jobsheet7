import java.util.Scanner;;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1, n, kali=1;
        System.out.print("Nilai n:");
        n = sc.nextInt();
        do {
            if (i<=n) {
                kali = kali*i;
            }i++;
            System.out.println("Nilai kali: " + kali);
        } while (i<=n);
    
}
}