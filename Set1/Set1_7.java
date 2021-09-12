/*7. Write a program which takes the number of days as input & convert it into years, months,
weeks, & days (hint: consider 365 days for a year, 30 days for a month ).*/
package set1_7;

public class Set1_7 
{

    public static void main(String[] args) 
    {
      int NoOfDays = 999;
      int years = NoOfDays / 365;
      int remainder1 = NoOfDays % 365;
      int months = remainder1 / 30;
      int remainder2 = remainder1 % 30;
      int weeks = remainder2 / 7;
      int days = remainder2 % 7;
      
        System.out.println("Years = "+ years);
        System.out.println("Months = "+ months);
        System.out.println("Weeks = "+ weeks);
        System.out.println("Days = "+ days);

    }
    
}
