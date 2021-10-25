/*Write a program to swap two numbers if they are even*/
package set5_1;


public class Set5_1 {

  
    public static void main(String[] args) 
    {
        int a = 4, b = 6;
        if(a % 2 == 0 && b % 2 == 0)
        {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
    
}
