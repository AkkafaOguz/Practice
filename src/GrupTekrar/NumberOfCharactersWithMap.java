package GrupTekrar;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharactersWithMap {

    public static void main(String[] args) {

        String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        str = str.replaceAll("\\s", "").replaceAll("\\W", "");

        Map<String, Integer> numberOfCharacters = new HashMap<>();

//        for (int i = 0; i < str.length(); i++) {
//
//            if (!numberOfCharacters.containsKey(String.valueOf(str.charAt(i)))) {
//                numberOfCharacters.put(String.valueOf(str.charAt(i)), 1);
//            } else {
//                numberOfCharacters.put(String.valueOf(str.charAt(i)), numberOfCharacters.get(String.valueOf(str.charAt(i))) + 1);
//            }
//        }
//        System.out.println(numberOfCharacters);


        String arr[] = str.split("");

        for (String w : arr) {

            if (!numberOfCharacters.containsKey(w)) {
                numberOfCharacters.put(w, 1);
            } else {
                numberOfCharacters.put(w, numberOfCharacters.get(w) + 1);
            }
        }
        System.out.println(numberOfCharacters);
    }
}
