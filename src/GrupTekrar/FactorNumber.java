package GrupTekrar;

public class FactorNumber {

    public static void main(String[] args) {

        int a = 68;
        int counter = 0;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0){
                System.out.print(i + " ");
                counter ++;
            }
        }
        System.out.println();
        System.out.println(a + " sayisini tam olarak bolen toplam " + counter + " sayi bulunmaktadir");

    }




}
