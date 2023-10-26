package src;

public class Klass {
    public static void main(String[] args) {
        int sum = 0;
        int x[] = {65, -77, 88, -200, 130};
        int min = x[0];
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
            if (x[i] < min) {
                min = x[i];
            }
            sum += x[i];
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("Average is:" + sum / x.length);
    }
}
//Задача