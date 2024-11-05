import java.util.Scanner;
public class Bioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiket=0, hargaTiket, totalHarga=0, diskon=0;
        char respon='y';

        while (respon=='y') {
            System.out.print("Masukkkan jumlah tiket: ");
            jumlahTiket=sc.nextInt();
            if (jumlahTiket<=0) {
                System.out.println("input invalid");
                continue;
                
            } else if (jumlahTiket>10) {
                diskon=(int) (0.15*50000);
            } else if (jumlahTiket > 4) {
                diskon = (int) (0.1 * 50000);
            } 
                hargaTiket = (50000 - diskon)*jumlahTiket;
                totalTiket = totalTiket + jumlahTiket;
                totalHarga = totalHarga + hargaTiket;
                System.out.println("Diskon: " + diskon);
                System.out.println("Harga tiket: " + hargaTiket);
                System.out.print("Transaksi lagi? (y/n): ");
                respon = sc.next().charAt(0);
            
        }
        System.out.println("Tota tiket: " + totalTiket);
        System.out.println("Total harga: " + totalHarga);
    }
}
