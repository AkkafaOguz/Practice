package technicalInterviewQuestions;

public class FactorNumber {

    public static void main(String[] args) {

        // Bir sayinin tam bolenlerini bulunuz

        int a = 68;
        int counter = 0;

        for (int i = 1; i < 68; i++) {

            if (a % i ==0) {
                System.out.print(i + " - ");
                counter++;
            }
        }
        System.out.println();
        System.out.println(a + " saysini tam bolen toplam " + counter + " sayi bulunmaktadir.");
    }
}
