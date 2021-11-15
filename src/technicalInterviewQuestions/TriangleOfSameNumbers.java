package technicalInterviewQuestions;

public class TriangleOfSameNumbers {

    /*
     * 1
     * 22
     * 333
     * 4444
     * 55555
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

        }
    }
}
