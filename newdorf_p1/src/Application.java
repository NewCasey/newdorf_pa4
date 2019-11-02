import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover remmy=new DuplicateRemover();
        remmy.remove("problem1.txt");
        remmy.Write("unique_words.txt");

    }
}