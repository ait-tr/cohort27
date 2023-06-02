public class Main {
    public static void main(String[] args) {
        Dictionary.DictionaryPair dictionaryPair = new Dictionary.DictionaryPair("Hello", "Привет");
        // создали два словаря
        Dictionary spainDictionary = new Dictionary();
        Dictionary englishDictionary = new Dictionary();
        // создали два переводчика на основе созданных словарей
        Dictionary.Translator spainTranslator = spainDictionary.new Translator();
        Dictionary.Translator englishTranslator = englishDictionary.new Translator();

    }
}
