package GrupTekrar;

public class ReverseString {

    public static void main(String[] args) {

        String sentence = "Appium ve Cypress ustun cabalarimiz sonucu acildi.";

        //1.Way:

        StringBuilder sb = new StringBuilder(sentence).reverse();

        System.out.println(sb);

        //2.Way:

        String reverseStr = "";

        for (int i = sentence.length()-1; i >=0 ; i--) {

            reverseStr+=sentence.charAt(i);
        }

        System.out.println(reverseStr);
    }
}
