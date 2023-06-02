import java.util.HashMap;
import java.util.List;

public class Dictionary {

    private List<DictionaryPair> translations;

    public static class DictionaryPair {
        private String original;
        private String translation;

        public DictionaryPair(String original, String translation) {
            this.original = original;
            this.translation = translation;
        }
    }

    public class Translator {
        public String[] translate(String[] originals) {
            System.out.println(translations);
            return new String[]{"Привет", "Java"};
        }
    }

    public void put(String original, String translation) {
        DictionaryPair pair = new DictionaryPair(original, translation);
        System.out.println(pair.original + " " + pair.translation);
        translations.add(pair);
    }

    public String get(String original) {
        if (original.equals("Hello")) {
            return "Привет";
        } else {
            return original;
        }
    }
}
