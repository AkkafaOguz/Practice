package GrupTekrar;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int a = 10;

        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */

        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }

        System.out.println();

        /*
         *     1
         *    22
         *   333
         *  4444
         * 55555
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int row = scan.nextInt();
        a = row;

        for (int i = row; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
                a--;
            }
            while (a > 0) {
                System.out.print("*");
                a--;
            }
            a = row;
        }
    }
}
