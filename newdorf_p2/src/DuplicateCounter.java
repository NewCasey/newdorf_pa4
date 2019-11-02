import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    private Map<String, Integer> wordCount;
    public DuplicateCounter(){
        wordCount = new HashMap<String,Integer>();
    }
    public void count(String filename){
        Scanner scnr = null;
        try {
            scnr = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        scnr.useDelimiter("([0-9]|[.,!?:;'\"-]|\\s)+");
        while(scnr.hasNext()) {
            String word = scnr.next().toLowerCase();
            Integer count = wordCount.get(word);
            if(count == null)
                count = 1;
            else
                count = count + 1;
            wordCount.put(word, count);
        }
        scnr.close();
    }

    public void write(String filename){
        try {
            PrintWriter outfile = new PrintWriter(new File(filename));
            for(String k : wordCount.keySet()) {
                outfile.println(k + " " + wordCount.get(k));
            }
            outfile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
    }
}