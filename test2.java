import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");

        scanner.close();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Handle empty or null sentences
        }

        String[] words = sentence.trim().split("\\s+"); // Split by whitespace
        return words.length;
    }
}
