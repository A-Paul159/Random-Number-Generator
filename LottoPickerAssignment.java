import java.util.Arrays;
import java.util.Scanner;
public class LottoPickerAssignment {
    public static void main(String[] args) {


        double Lotto[] = new double[5];
        int i = 0;
        double x = 0;
        int a = 0;
        int b = 0;
        /* Create a loop to fill the array with the random numbers*/
        while (i < 5) {
            /* Green light parameters*/
            a = 0;
            b = 1;
            /* Create a positive random 2 digit number*/
            x = Math.random();
            x = x * 100;
            x = Math.round(x);
            /* If the number is in the range [0,Upper] the first parameter is green*/
            if (x > 1 && x <= 30) {
                a = 1;
            }
            /* If the number is distinct from the others the second parameter is green*/
            int k = 1;
            while (k <= i) {
                if (x == Lotto[i-k]) {
                    b = 0;
                    break;
                }
                k++;
            }
            /* If both parameters are green, record the number in array and move to the next number*/
            if (a == 1 && b == 1) {
                Lotto[i] = x;
                i++;
            }
        }
        System.out.println(Arrays.toString(Lotto));

    }
}