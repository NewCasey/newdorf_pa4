public class Application {

    public static void main(String[] args) {

        String inputFile = "problem2.txt";
        String outputFile = "unique_word_counts.txt";
        DuplicateCounter dup = new DuplicateCounter();
        dup.count(inputFile);
        dup.write(outputFile);
        System.out.print("Unique word count written to \"unique_word_counts\". What a creative name.");

    }
}