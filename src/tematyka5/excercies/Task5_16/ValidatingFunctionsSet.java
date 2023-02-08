package tematyka5.excercies.Task5_16;

import java.util.HashMap;

/**
 * Created by BIURO22 on 2023-01-24
 */
public class ValidatingFunctionsSet {


    public void checkIfKeyInSet(HashMap<String, String> set, String key) {
        if (set.containsKey(key)) {
            System.out.println("The key " + key + " is in the collection.");
        } else {
            System.out.println("There is no key " + key + " in this collection.");
        }
    }

    public void checkValuesBeginningNumber(HashMap<String, String> set, String number) {
        for (String value : set.values()) {
            if (value.startsWith(number)) {
                System.out.println("The id value " + value + (" begins with " + number + "."));
            }
        }
    }

    public void removeValue(HashMap<String, String> map, String entryToRemove) {
        map.remove(entryToRemove);
    }

    public void verifyCollectionLength(HashMap<String, String> map) {
        if (map.size() == 3) {
            System.out.println("The map`s size is correct.");
        }
    }

    public void getValueOfKey(HashMap<String, String> map, String key) {
        if (map.containsKey(key)) {
            System.out.println("Assigned value to key " + key + " is " + map.get(key) + ".");
        }
        else {
            System.out.println("No such name.");
        }
    }

    public void checkIfMapEmpty (HashMap<String, String> map) {
        if(map.isEmpty()) {
            System.out.println("Nothing to do here.");
        }
        else {
            System.out.println("Collection length = " + map.size() + ".");
        }
    }

}
