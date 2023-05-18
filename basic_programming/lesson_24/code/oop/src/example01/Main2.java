package example01;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(5);
        dictionary.add("Marsel");
        dictionary.add("Markus");
        dictionary.add("Compass");
        dictionary.add("Paris");
        dictionary.add("Marmalade");

        String[] words = dictionary.getWordsByPrefix("Mar");
        System.out.println(Arrays.toString(words));
    }
}
