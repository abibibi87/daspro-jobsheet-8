import java.util.Scanner;

public class Tugas218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3.");
        } else {
            int jumlah = 0;                                    // penampung jumlah seluruh angka
            for (int baris = 1; baris <= n; baris++) {         // outer loop: nomor baris
                for (int kolom = 1; kolom <= n; kolom++) {     // inner loop: nomor kolom
                    int hasil = baris * kolom;
                    System.out.printf("%4d", hasil);           // lebar 4 karakter, rata kanan
                    jumlah += hasil;
                }
                System.out.println();                          // pindah baris
            }
            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}