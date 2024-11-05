import java.util.Scanner;
public class Nomor8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, hasil=0;
        System.out.print("Nilai a: ");
        bil1 = sc.nextInt();
        System.out.print("Nilai b: ");
        bil2 = sc.nextInt();

        for (int i = 0; i < bil1; i++) {
            hasil += bil2;
        }
        System.out.println("Hasil " + hasil);
    }
}
