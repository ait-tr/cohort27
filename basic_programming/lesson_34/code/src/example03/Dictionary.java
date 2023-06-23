package example02;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Dictionary {

    private WordPair[] pairs;

    private static class WordPair {
        private String original;
        private String translation;
    }

    public void put(String original, String translation) {
        //
    }

    public class Translator {
        public String[] translate(String[] text) {
            String[] result = new String[text.length];

            for (int i = 0; i < text.length; i++) {
                String original = text[i];
                for (int j = 0; j < pairs.length; j++) {
                    if (original.equals(pairs[j].original)) {
                        result[i] = pairs[j].translation;
                    }
                }
            }

            return result;
        }
    }
}
