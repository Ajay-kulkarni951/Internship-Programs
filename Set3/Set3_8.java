/*8. Write a program to check given two points of a line are parallel to Y axis or not in a
Cartesian Co ordinate System using ternary operator.*/

package set3_8;


public class Set3_8
{

    public static void main(String[] args)
    {
       int x1 = 2, x2 = 2, y1 = 4, y2 = 2;
       String result;
       result = (x1==x2)? "Parallel" : "Not Parallel";
        System.out.println("Given points are "+result+" to Y axis");
    }

}
