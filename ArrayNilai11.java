public class ArrayNilai11 {
    public static void main(String[] args) {
        System.out.println("hello world");
        
        int[] nilai = {80, 85, 90, 75, 88, 92, 78, 84, 89, 95};

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) {
                System.out.println("nilai " + nilai[i] + " lulus");
            } else {
                System.out.println("nilai " + nilai[i] + " tidak lulus");
            }
        }
    }
}
