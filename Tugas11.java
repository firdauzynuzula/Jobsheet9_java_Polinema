import java.util.Scanner;

public class Tugas11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        int[] data = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        System.out.println("Data yang dimasukkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("nilai[" + i + "] = " + data[i]);
        }

        scanner.close();
    }
}
