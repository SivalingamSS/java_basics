import java.util.*;

    public class wordfrequency
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a paragraph or a series of sentences:");
            String inputText = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

            Map<String, Integer> wordFrequency = new HashMap<>();
            for (String word : inputText.split("\\s+"))
            {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

                   wordFrequency.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }
    }


