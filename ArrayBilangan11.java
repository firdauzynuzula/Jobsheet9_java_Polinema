public class ArrayBilangan11 {
    public static void main(String[] args) {
        int[] bil = {1,2,3,4,5,6,7,8,9,10};


        bil[0] = 5.0;
        bil[1] = 12867;
        bil[2] = 7.5;
        bil[3] = 2_000_000;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
    }
}
