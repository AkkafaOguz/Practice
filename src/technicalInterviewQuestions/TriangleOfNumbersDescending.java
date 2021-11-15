package technicalInterviewQuestions;

public class TriangleOfNumbersDescending {

    public static void main(String[] args) {

        /*
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */

        for (int i = 1; i <=5 ; i++) {
            System.out.println();
            for (int j = 5; j >=i ; j--) {
                System.out.print(j);
            }
        }
    }
}
