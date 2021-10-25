/*Write a program to accept the co efficient of a quadratic equation like a,b and c and then
find the Discriminant ( disc= ( b*b)- 4*a*c). And display the type of the roots*/
package set6_2;
import java.util.Scanner;

public class Set6_2 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double disc=(double)((b*b)-(4*a*c));
                System.out.println("Descrimnant "+ disc);
                if(disc>0)
                {
                            System.out.println("Roots are real");
                }
                else
                {
                    
                if(disc<0)
                {
                            System.out.println("Roots are Imaginary");
                }
                else
                {
                            System.out.println("Roots are Equal");
                }
                }
    }
    
}
