package technicalInterviewQuestions;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int a = 153;
        int temp = 0;
        int sum = 0;


        for (int i = a; i > 0; i /= 10) {
            temp = i % 10;
            sum += Math.pow(temp, 3);
        }

        if (sum == a) {
            System.out.println("This is an Armstrong number");
        } else {
            System.out.println("This is not an Armstrong number");
        }
    }
}
