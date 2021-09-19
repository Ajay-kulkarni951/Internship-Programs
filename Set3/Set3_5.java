/*5. Write a program to take sides of a triangle and check the type of the triangle*/

package set3_5;


public class Set3_5
{

    public static void main(String[] args)
    {
       int a = 4, b = 6, c = 5;
       String type = (a==b && b==c)? "Equilateral" : (a==b || b==c || a==c)? "Isosceles" : 
                      (a!=b || b!=c)? "Scalene" : "check values again";
        System.out.println("Given Triangle is "+type);
    }

}
