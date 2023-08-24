package simplecodes;

import java.util.Scanner;

public class Factorial {

    public void fact(int val) {
        int fact = 15;
        for (int i = 1; i <= val; i++) {
            fact = i * fact;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        System.out.println("Enter your value to find factorial");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Factorial obj = new Factorial();
        obj.fact(input);

    }

}
