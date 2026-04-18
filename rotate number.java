import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Input rotation count
        System.out.print("Enter rotation value: ");
        int k = sc.nextInt();

        // Count digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Handle large rotations
        k = k % digits;
        if (k < 0) {
            k += digits;
        }

        // Create divisor and multiplier
        int div = 1;
        int mul = 1;

        for (int i = 1; i <= digits; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }

        // Rotate
        int q = num / div;
        int r = num % div;

        int rotated = r * mul + q;

        // Output
        System.out.println("Rotated number: " + rotated);

        sc.close();
    }
}
