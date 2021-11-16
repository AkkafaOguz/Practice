package GrupTekrar;

import java.util.Arrays;

public class NumberOfCharacters {

    public static void main(String[] args) {

        String sentence = "Appium ve Cypress ustun cabalarimiz sonucu acildi.";
        sentence = sentence.replaceAll("\\W", "");

        int counter = 1;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == 'a') {
                counter++;
            }
        }

        System.out.println(counter);


        int count = 1;

        String arr[] = sentence.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i].equals(arr[i + 1])) {
                count++;

            } else {
                System.out.print(arr[i] + "= " + count + " ");
                count = 1;
            }
        }




    }
}
