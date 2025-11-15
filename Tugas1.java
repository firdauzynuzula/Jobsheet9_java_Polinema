import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlah = input.nextInt();
        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        double rata = (jumlah > 0) ? (double) total / jumlah : 0;
        System.out.println("\nDaftar semua nilai yang diinputkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + ": " + nilai[i]);
        }
        // Cari nilai maksimum dan minimum
        if (jumlah > 0) {
            int max = nilai[0];
            int min = nilai[0];
            for (int i = 1; i < jumlah; i++) {
                if (nilai[i] > max) max = nilai[i];
                if (nilai[i] < min) min = nilai[i];
            }
            System.out.println("Nilai tertinggi: " + max);
            System.out.println("Nilai terendah: " + min);
        }
        System.out.println("Rata-rata nilai mahasiswa: " + rata);
        input.close();
    }
}
