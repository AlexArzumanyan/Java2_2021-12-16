package lesson3;

import java.util.*;

public class Homework1 {
    private static final String[] INPUT_DATA = {

            "A", "A", "A",
            "B",
            "C",
            "D", "D", "D", "D",
            "E",
            "F", "F",
            "G",
            "H",
            "I", "I",
            "J",
            "K",
            "A",
            "B",
            "А",
            "K",

    };

    public static void main(String[] args) {
        Map<String, Integer> quantityWords = new LinkedHashMap<>();
        for (String word : INPUT_DATA) {
            Integer quantity = quantityWords.get(word);
            if (quantity == null) {
                quantity = 0;
            }
            quantityWords.put(word, quantity + 1);
        }
        for (Map.Entry<String, Integer> entry : quantityWords.entrySet()) {
            System.out.printf("Слово %s - встречается %d раз %n", entry.getKey(), entry.getValue());
        }


    }
}








