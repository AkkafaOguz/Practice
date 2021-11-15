package technicalInterviewQuestions;

public class ReverseNumber {

    public static void main(String[] args) {

        //1. Way:

        int num = 1234;


        for (int i = num; i > 0; i /= 10) {

            System.out.print(i % 10);
        }

        System.out.println("\n-------------------------");

        //2. Way:

        int num2 = 1234;

        while (num2 != 0) {

            System.out.print(num2 % 10);
            num2 = num2 / 10;
        }

    }
}
