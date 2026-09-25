package Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b;
        b = a;
        for (int i = 0;i < 6; i++) {
            System.out.println(b[i]);
        }
    }
}
