public class reversestring
{
    public static void main(String[] args)
    {
        String inputString = "welcome the java";
        String reversedWords = reverseWord(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed Words: " + reversedWords);
    }

    public static String reverseWord(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }
}

