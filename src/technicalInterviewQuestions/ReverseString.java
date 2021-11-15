package technicalInterviewQuestions;

public class ReverseString {

    public static void main(String[] args) {

        //1. Way:

        String str = "Reverse String";

        StringBuilder sb = new StringBuilder(str).reverse();

        System.out.println(sb);

        //2. Way:

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);
        }

        System.out.println(reversed);

    }
}
