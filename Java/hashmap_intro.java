import java.util.*;

public class hashmap_intro {
    public static void main(String[] args) {
        // declaration of a HashMap of String Type
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        //Adding Items to the Hashmap
        capitalCities.put("England","London");
        capitalCities.put("India","New Delhi");
        capitalCities.put("Norway","Oslo");
        System.out.println(capitalCities);
        //Accessing particular Items
        capitalCities.get("England");
        //Removing an Item
        //capitalCities.remove("England");
        // hasmap size
        System.out.println(capitalCities.size());
        //Looping through a Hashmap: PRINTING KEYS
        for(String i: capitalCities.keySet()){
            System.out.println(i);
        }System.out.println("-------");
        //Looping through a Hashmap: PRINTING VALUES
        for(String i: capitalCities.values()){
            System.out.println(i);
        }System.out.println("-------");
        // Printing Keys & Values:
        for(String i: capitalCities.keySet()){
            System.out.println("KEY:"+i+" VALUE:"+capitalCities.get(i));
        }
        // Removing while hashmap:
        capitalCities.clear();
        
    }
    
}
