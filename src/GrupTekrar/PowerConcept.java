package GrupTekrar;

public class PowerConcept {

    public static void main(String[] args) {

        //1.Way:

        int a = 3;
        int b = 7;
        double result2 = 3;

        double result = Math.pow(3,7);
        System.out.println(result);

        //2.Way:

        for (int i = 0; i < 6; i++) {
            result2 *= a;
        }
        System.out.println(result2);

    }
}
