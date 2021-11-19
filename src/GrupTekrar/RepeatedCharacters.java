package GrupTekrar;

import java.util.ArrayList;
import java.util.List;

public class RepeatedCharacters {

    public static void main(String[] args) {

        /*
         * Bir String icerisinde yinelenen karakterleri döndüren bir kod
         * yazıniz.(mülakat Sorusu)
         *
         * Input :
         *
         * String str=“Javaisalsoeasy”
         *
         * Output: a s
         */

        String str = "Javaisalsoeasy";

        boolean isRepeated;

        List<String> rpeatedChracters = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            isRepeated = str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i));

            if (isRepeated && !rpeatedChracters.contains(String.valueOf(str.charAt(i)))) {
                rpeatedChracters.add(String.valueOf(str.charAt(i)));
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
