package collections.hashmap;

import java.util.HashMap;

class HashMaps {

    private HashMap<String, String> capitalCities;

    public static void main(String[] args){
        HashMaps x = new HashMaps();
        x.create();
        x.access();
        x.size();
        x.loop();
        x.delete();
        x.deleteAll();
    }

    private void create(){
        // Create a HashMap object called capitalCities
        capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
    }

    private void access(){
        // Retrieve the item with key "England"
        capitalCities.get("England");
    }

    private void size(){
        // Return the amount of items in the HashMap
        System.out.println(capitalCities.size());
    }

    private void loop(){
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }

    private void delete(){
        // Delete the item with the key "England"
        capitalCities.remove("England");
    }

    private void deleteAll(){
        // Delete all items from the HashMap
        capitalCities.clear();
    }
}