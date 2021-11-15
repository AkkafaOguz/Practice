package GrupTekrar;

public class PrimeNumber {

    public static void main(String[] args) {

        int a = 20;
        boolean isPrime= true;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }

    }


}
