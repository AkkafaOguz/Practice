package GrupTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostUsedCharacter {

    public static void main(String[] args) {

        // Kullanicidan bir cumle aliniz ve bu cümlede en cok kullanilan karakteri
        // yazdiriniz.

        String str = "Java is also easy if you study hard bitches";

        str = str.replaceAll("\\s", "");

        String arr[] = str.split("");

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int max = 0;
        int current = 0;
        String mostRepeatedCharacter = "";

//        for (int i = 0; i < arr.length-1; i++) {
//
//            if (arr[i].equals(arr[i+1])){
//                current++;
//                if (current>max){ //max = 5
//                    max=current;
//                    mostRepeatedCharacter = arr[i];
//                }
//            } else{
//                current = 0;
//            }
//        }
//        System.out.println(mostRepeatedCharacter);

        List<String> mostRepeatedCharacters = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i].equals(arr[i + 1])) {
                current++;

                if (current >= max) { //max = 5

                    if (current > max) {
                        mostRepeatedCharacters.clear();
                    }

                    if (!mostRepeatedCharacters.contains(arr[i])) {
                        mostRepeatedCharacters.add(arr[i]);
                    }

                    max = current;

                }
            } else {
                current = 0;
            }
        }

        System.out.println(mostRepeatedCharacters);

    }
}
