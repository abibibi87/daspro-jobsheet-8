import java.util.Scanner;

public class Tugas318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko harus minimal 1.");
        } else {
            int totalSemua = 0;          // total barang seluruh toko
            int barangTerbanyak = -1;    // -1 agar toko pertama pasti tercatat (toko boleh 0 barang)
            int tokoTerbanyak = 0;
            String ringkasan = "";       // penampung baris ringkasan tiap toko

            for (int toko = 1; toko <= jumlahToko; toko++) {
                System.out.println("Toko " + toko);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;     // di-reset setiap toko
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Barang yang dibeli pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko + "\n";
                totalSemua += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {   // '>' : jika seri, toko bernomor kecil tetap dipilih
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}