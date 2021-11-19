package GrupTekrar;

import java.util.*;

public class Hobbies {
    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {
        List <String> nameOfPeople = new ArrayList<>();


//        Set <String> keys = hobbies.keySet();
//        for (String w: keys) {
//            String arr [] = hobbies.get(w);
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].equals(hobby)){
//                    nameOfPeople.add(w);
//                }
//            }
//        }



        for (Map.Entry<String, String[]> w : hobbies.entrySet()) {

            if (Arrays.stream(w.getValue()).anyMatch(t-> t.equals(hobby))){
                nameOfPeople.add(w.getKey());
            }
        }
        return nameOfPeople;
    }



        public static void main (String[]args){
            Hobbies hobbies = new Hobbies();
            hobbies.add("Steve", "Fashion", "Piano", "Reading");
            hobbies.add("Patty", "Drama", "Magic", "Pets");
            hobbies.add("Chad", "Puzzles", "Pets", "Yoga");
            System.out.println(Arrays.toString(hobbies.findAllHobbyists("Pets").toArray()));
        }
    }
