/*3. Write a program to find the distance between the two points in Cartesian coordinate
     system.*/

package set2_3;

public class Set2_3
{

    public static void main(String[] args)
    {
       int x1 = 5, y1 = 7, x2 = 12, y2 =10;
       
       double K = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);    //calculates (x2 - x1) ^ 2 + (y2 - y1) ^ 2
       double ed = Math.sqrt(K);     // Euclidean Distance
       
        System.out.println("Distance is "+ ed);        
    }

}
