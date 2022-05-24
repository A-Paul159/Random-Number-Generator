/*
Generate 5 random numbers
 */


public class JavaTrial1 {
    public static void main(String[] args) {
        System.out.println("The 5 randomly generated numbers are:");


        double Lotto[] = new double[5];
        int i = 0;
        double x = 0;
        while (i < 5) {
            x = Math.random();
            x = x * 100;
            x = Math.round(x);
            if (x < 30) {
                Lotto[i] = x;
                i++;
            }
        }
        System.out.print(Lotto[0] + ", ");
        System.out.print(Lotto[1] + ", ");
        System.out.print(Lotto[2] + ", ");
        System.out.print(Lotto[3] + ", ");
        System.out.print(Lotto[4] + ", ");



    }
    }

