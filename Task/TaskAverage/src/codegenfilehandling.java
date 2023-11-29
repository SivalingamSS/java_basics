import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

    public class codegenfilehandling
    {
        public static void main(String[] args)
        {
            String code = "public class GeneratedClass {\n" +
                    "\tpublic static void main(String[] args) {\n" +
                    "\t\tSystem.out.println(\"Generated Java Code!\");\n" +
                    "\t}\n" +
                    "}\n";

            String filePath = "GeneratedClass.java";

            try
            {
                Path file = Paths.get(filePath);
                Files.write(file, code.getBytes());
                System.out.println("Java code generated and saved to file: " + filePath);
            }
            catch (Exception e)
            {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
    }


