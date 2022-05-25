import java.util.Arrays;
import java.util.Scanner;
public class JavaTrial1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("How many unique numbers would you like: ");
        int Length = myObj.nextInt();
        System.out.println("What is the upper bound for the numbers: ");
        int Upper = myObj.nextInt();

        double Lotto[] = new double[Length];
        int i = 0;
        double x = 0;
        int a = 0;
        int b = 0;
                    /* Create a loop to fill the array with the random numbers*/
        while (i < Length) {
                    /* Green light parameters*/
            a = 0;
            b = 1;
                    /* Create a positive random 2 digit number*/
            x = Math.random();
            x = x * 100;
            x = Math.round(x);
                    /* If the number is in the range [0,Upper] the first parameter is green*/
            if (x > 1 && x <= Upper) {
                a = 1;
            }
                    /* If the number is distinct from the others the second parameter is green*/
            int k = 1;
            while (k <= i) {
                if (x == Lotto[i-k]) {
                    b = 0;
                    System.out.println("---" + x + " was randomly generated a second time so it was removed.---");
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
                    /* Run a loop to print each element from the array because I didn't know how to do it all at once*/
        System.out.println("The " + Length + " randomly generated numbers are:");
        /*for (int j = 0; j < Length; j++) {
            System.out.print(Lotto[j] + " ");
        }*/
        System.out.println(Arrays.toString(Lotto));

    }
}


