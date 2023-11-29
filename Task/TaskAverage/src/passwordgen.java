import java.util.Random;

public class passwordgen
{
    public static void main (String[] args)
    {
        System.out.println(GeneratedPassword (8));
    }

    private static char[] GeneratedPassword(int leni)
    {
        String UppercaseLetter= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowercaseLetter = "abcdefghijklmnopqrstuvwxyz";
        String SpecialCharter  = "!@#$";
        String numbers = "1234567890";

        String combines = UppercaseLetter +LowercaseLetter + SpecialCharter + numbers ;
        Random random = new Random();
        char[]  password = new char[ leni];

        password[0] = UppercaseLetter.charAt(random.nextInt(UppercaseLetter.length()));
        password[1] = LowercaseLetter.charAt(random.nextInt(LowercaseLetter.length()));
        password[2] = SpecialCharter.charAt(random.nextInt(SpecialCharter.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4 ; i < leni ; i++ )
        {
            password[i] = combines.charAt(random.nextInt(combines.length()));
        }
          return password;
    }
}
