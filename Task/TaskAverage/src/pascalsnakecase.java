public class pascalsnakecase
{
        public static void main(String[] args)
        {
            String pascalCase = " MyNameIsVisualappFoundry";
            String snakeCase = convertPascalToSnakeCase(pascalCase);
            System.out.println("PascalCase: " + pascalCase);
            System.out.println("Snake_case: " + snakeCase);
        }
        public static String convertPascalToSnakeCase(String input)
        {
            return input.replaceAll("(.)(\\p{Upper})", "$1_$2").toLowerCase();
        }


}
