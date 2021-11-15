import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTekrar {

    public static void main(String[] args) {

        LinkedList <String> deneme = new LinkedList<>();
        deneme.add("Oguz");
        deneme.add("Sevval");
        System.out.println(deneme);


        ListIterator <String> listitr = deneme.listIterator();
        listitr.add("deneme");
        System.out.println(deneme);

        //Bu sekilde iterator olusturduktan sonra bunun uzerinden ekleme yaparsan, pointer basta oldugu icin son eklenen elemani en basa ekler.

        deneme.add("deneme2");
        System.out.println(deneme);

        //Iterator olusturduk sonra ekleme islemini iterator uzerinden degil de list'in kendisi uzerinden yaparsan, son elemani list'in sonuna ekler.

        for (String w: deneme) {

            w= w+ " deneme";
        }

        System.out.println(deneme);

        //List degismiyor.

        for (int i = 0; i < deneme.size(); i++) {

            deneme.set(deneme.indexOf(deneme.get(i)),(deneme.get(i) + " deneme"));
        }

        System.out.println(deneme);

        //List degisiyor.

        //En mantiklisi ve guzel olani iterator kullanmak.

    }
}
