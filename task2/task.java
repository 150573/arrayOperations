import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] ten = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int value : ten) {
            sum += value;
        }
        System.out.println("Sum of the values in the array 'ten': " + sum);
        // Sort the array in descending order
        Arrays.sort(ten);
        for (int i = 0; i < ten.length / 2; i++) {
            int temp = ten[i];
            ten[i] = ten[ten.length - 1 - i];
            ten[ten.length - 1 - i] = temp;
        }
        // Replace 100 with 1000
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == 100) {
                ten[i] = 1000;
                break; // Assuming 100 appears only once in the array
            }
        }
        System.out.println("Values in the array 'ten' after replacing 100 with 1000 and sorting in descending order:");
        for (int value : ten) {
            System.out.print(value + " ");
        }
    }
}
