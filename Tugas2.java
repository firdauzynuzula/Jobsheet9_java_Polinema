public class Tugas2 {
    public static void main(String[] args) {
        int[] angka = new int[10];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1;
        }

        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] = " + angka[i]);
        }
    }
}

