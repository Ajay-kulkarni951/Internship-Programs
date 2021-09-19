/*7. Write a program to check given two points of a line are parallel to X axis or not in a
Cartesian Co ordinate System using ternary operator.*/

package set3_7;


public class Set3_7
{

    public static void main(String[] args)
    {
       int x1 = 2, x2 = 1, y1 = 2, y2 = 2;
       String result;
       result = (y1==y2)? "Parallel" : "Not Parallel";
        System.out.println("Given points are "+result+" to X axis");
    }

}
