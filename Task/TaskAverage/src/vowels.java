public class vowels
{
    public static void main (String args[])
    {
        String str = "welcome to the java";
       int  vcount = 0, ccount =0;
        for ( int i =0 ;i< str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vcount++;
            }
             else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            {
                ccount++;
            }
        }
        System.out.println("number of vowles "+vcount);
        System.out.println("number of ccount "+ccount);

    }
}
