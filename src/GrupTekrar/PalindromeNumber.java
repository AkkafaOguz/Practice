package GrupTekrar;

public class PalindromeNumber {

    public static void main(String[] args) {

        int a = 12521;
        String aStr = "";
        int rev = 0;

        for (int i = a; i > 0 ; i/=10) {

            aStr+=i%10;

        }

        System.out.println(aStr);

        if (Integer.parseInt(aStr) == a){
            System.out.println("This is a palindrome number");
        } else {
            System.out.println("This is not a palindrome number");
        }


        System.out.println("================================");

        while(a !=0) {
            int n = a % 10;
            rev = rev*10 + n;
            a = a/10;
        }
    }
}
