package technicalInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {

        //1. Way:

        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 0; i < 20; i++) {

            int sum = fibonacci.get(i) + fibonacci.get(i + 1);
            fibonacci.add(sum);

        }

        System.out.println(fibonacci);

        System.out.println("---------------------------------");

        //2. Way:

        int a = 22;
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i < a; i++) {
            System.out.print(" " + num1 + ",");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
}
