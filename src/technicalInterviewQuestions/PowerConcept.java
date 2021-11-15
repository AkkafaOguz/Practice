package technicalInterviewQuestions;

public class PowerConcept {

    public static void main(String[] args) {

        int base = 5;
        int power = 3;
        int resultNUm = 5;

        for (int i = 0; i < power; i++) {

            resultNUm *= base;
        }

        System.out.println(resultNUm);
    }
}
