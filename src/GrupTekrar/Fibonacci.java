package GrupTekrar;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    // 0 1 1 2 3 5 8 13 21
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int sum = 0;


//        for (int i = 0; i < 15; i++) {
//
//            System.out.print(a+ " ");
//            sum = a + b;
//            a = b;
//            b = sum;
//
//        }

//        while (a < 150) {
//
//            System.out.print(a+ " ");
//            sum = a + b;
//            a = b;
//            b = sum;
//        }


        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 0; i < 20; i++) {

            sum = fibonacci.get(i) + fibonacci.get(i+1);
            fibonacci.add(sum);

        }

        System.out.println(fibonacci);
    }
}
