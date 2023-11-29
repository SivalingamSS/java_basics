public class reverselist
{
    public  static  void main (String args[])
    {
        int my_input , reverse_input;
        my_input = 123456789;
        reverse_input = 0;
        System.out.println("The number is defined as " +my_input);
        while(my_input != 0)
        {
            int remainder = my_input % 10;
            reverse_input = reverse_input * 10 + remainder;
            my_input = my_input/10;
        }
        System.out.println("The reverse value of the given input is: " + reverse_input);
    }
}
