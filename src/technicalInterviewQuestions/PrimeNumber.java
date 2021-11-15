package technicalInterviewQuestions;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 19;

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        String result = isPrime ? "This is a prime number" : "This is not a prime number";
        System.out.println(result);
    }
}
