/*4. Write a program to find the position of a point in a Cartesian coordinate system using
     ternary operator.*/

package set3_4;


public class Set3_4
{

    public static void main(String[] args)
    {
       int x = 0 , y = 0;
       String point = (x>0 && y>0)? "1st Quadrant" : (x<0 && y>0)? "2nd Quadrant" : (x<0 && y<0)? "3rd Quadrant":
               (x>0 && y<0)? "4th Quadrant" : (x==0 && y==0)? "Origin" : (x>0 && y==0)? "Positive X Quadrant" :
               (x==0 && y>0)? "Positive Y Quadrant" : (x<0 && y==0)?"Negative X Quadrant" : "Negative Y Quadrant";
               System.out.println("Point lies in "+ point);
    }

}
