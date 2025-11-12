import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        
        // Perulangan untuk menerima inputan
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        
        // Perulangan untuk menampilkan elemen array
        System.out.println("\nNilai-nilai yang telah diinputkan:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilaiAkhir[i]);
        }
        
        input.close();
    }
}
