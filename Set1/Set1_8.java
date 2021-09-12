/*8. Write a program which takes the number of seconds as input & convert it into hours,
minutes and seconds.*/

package set1_8;


public class Set1_8
{

    public static void main(String[] args)
    {
       int Input_Seconds = 4000;
       int hours = Input_Seconds / 3600;
       int remainder = Input_Seconds % 3600;
       int minutes = remainder / 60;
       int seconds = remainder % 60;
       
        System.out.println("Hours = "+ hours);
        System.out.println("Minutes = "+ minutes);
        System.out.println("Seconds = "+ seconds);
    }

}
