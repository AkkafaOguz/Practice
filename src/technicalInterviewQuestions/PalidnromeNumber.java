package technicalInterviewQuestions;

public class PalidnromeNumber {

    public static void main(String[] args) {


        //1. Way:

        int a = 12321;

        String num = String.valueOf(a);

        StringBuilder sb = new StringBuilder(num).reverse();

        if (num.equals(sb.toString())) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }

        //2.Way:

        int b = 12321;
        String reverseNumStr = "";

        for (int i = b; i > 0; i /= 10) {

            reverseNumStr += i % 10;

        }

        int reseveredNum = Integer.parseInt(reverseNumStr);

        if (reseveredNum == b) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }


    }
}
