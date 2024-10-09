import java.util.Scanner;
public class Bioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tiket=50000, totalHarga, diskon;
        int jmlTiket, i=0;
        System.out.print("Masukkan jumlah tiket: ");
        jmlTiket = sc.nextInt();

        while (i < jmlTiket) {
            if (jmlTiket>4) {
                diskon=0.1;
                totalHarga = diskon * (jmlTiket*tiket);
                System.out.println("Yang harus dibayar Rp " + totalHarga);
            } else if (jmlTiket>10) {
                diskon = 0.15;
                totalHarga = diskon * (jmlTiket*tiket);
                System.out.println("Yang harus dibayar Rp " + totalHarga);
            } else {
                System.out.println("Silahkan input ulang");
            }
        }
        i++;
    }
}
