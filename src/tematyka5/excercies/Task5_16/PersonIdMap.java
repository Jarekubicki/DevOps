package tematyka5.excercies.Task5_16;

import java.util.HashMap;

/**
 * Created by BIURO22 on 2023-01-24
 */
public class PersonIdMap {
    public static void main(String[] args) {

        HashMap<String, String> identificationNumbers = new HashMap<>();

        identificationNumbers.put("Adam", "93214500312");
        identificationNumbers.put("Lola", "77231290123");
        identificationNumbers.put("Euzebiusz", "87128900451");
        identificationNumbers.put("Max", "51030267345");
        identificationNumbers.put("Jefrey", "89010276531");

        ValidatingFunctionsSet validator = new ValidatingFunctionsSet();

        validator.checkIfKeyInSet(identificationNumbers, "Ola");
        validator.checkValuesBeginningNumber(identificationNumbers, "9");
        validator.removeValue(identificationNumbers, "Max");
        validator.removeValue(identificationNumbers, "Jefrey");
        validator.verifyCollectionLength(identificationNumbers);
        validator.getValueOfKey(identificationNumbers, "Euzebiusz");
        validator.checkIfMapEmpty(identificationNumbers);
    }
}
