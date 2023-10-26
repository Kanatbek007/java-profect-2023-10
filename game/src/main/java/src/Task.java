package src;

public class Task {
    public static void main(String[] args) {
        int x[] = {30, 20, 13};
        int min = x[0];
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
            if (x[i] < min) {
                min = x[i];
            }
        }
        int average = (min + max) / 2;
        int middle = x[0];
        int difference = Math.abs(middle - average);
        for (int i = 1; i < x.length; i++) {
            int r = Math.abs(x[i] - average);
            if (r < difference) {
                middle = x[i];
                difference = r;
            }
        }
        System.out.println(middle);
    }
}
