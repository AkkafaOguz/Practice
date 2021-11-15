package GrupTekrar;

public class ArmstrongSayi {

    public static void main(String[] args) {

        int a = 153;
        int temp = a;
        int sum = 0;
        int num = 0;


//        while(temp!=0){
//
//            num = temp%10;
//            sum += num * num * num;
//            System.out.println(sum);
//            temp /= 10;
//        }
//
//
//
//        if (sum == a) {
//            System.out.println("Bu bir armstrong sayidir");
//        } else {
//            System.out.println("Degildir");
//        }



        for (int i = a; i > 0; i /= 10) {

            num = i % 10;
            sum += Math.pow(num,3);

        }

        System.out.println(sum);
        System.out.println(a);

        if (sum == a) {
            System.out.println("Bu bir armstrong sayidir");
        } else {
            System.out.println("Degildir");
        }


    }


}
