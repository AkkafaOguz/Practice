package GrupTekrar;

public class Swap {

    public static void main(String[] args) {

    int a = 19;
    int b = 3;
    int temp = a;

//    a=b;
//    b=temp;
//
//        System.out.println(a);
//        System.out.println(b);


    a = a - b ; //16
    b = a + b ; //19
    a = b - a ; //3

        System.out.println(a);
        System.out.println(b);

    }

}
