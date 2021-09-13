//5. Write a program to find the area of triangle when three points are given. 

//consider (x1,y1),(x2,y2),(x3,y3) are given points of the 3 sides of triangle.
/*first calculate distance between (x1,y1) and (x2,y2) then Second (x2,y2) and (x3,y3)
  then third (x1,y1) and (x3,y3).*/
//next calculate area using heron's equation.
package set2_5;

public class Set2_5
{

    public static void main(String[] args)
    { 
        
       int x1 = 5, y1 = 7, x2 = 12, y2 =10, x3 = 13, y3  = 15;
        
       double L = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);   //calculates (x2 - x1) ^ 2 + (y2 - y1) ^ 2
       double a = Math.sqrt(L);      // Euclidean Distance
       
       double M = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2);   //calculates (x3 - x2) ^ 2 + (y3 - y2) ^ 2
       double b = Math.sqrt(M);      // Euclidean Distance
       
       double N = Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2);   //calculates (x3 - x1) ^ 2 + (y3 - y1) ^ 2
       double c = Math.sqrt(N);      // Euclidean Distance
       
       double S = (a + b + c) / 2;
       double P = (S - a) * (S - b) * (S - c);
       double A = Math.sqrt(P);      //calculates square root of (S - a) * (S - b) * (S - c)
       
        System.out.println("Area of Triangle is "+ A);
    }

}
