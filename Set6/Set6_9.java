package Set6_9.java;
import java.util.Scanner;
/*
9. Write a program to calculate the area of different geometric shapes like
Square,Rectangle,Circle and triangle based on the user Choice
*/

public class Set6_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Rectangle \t 2.Square \t 3.Triangle \t 4. Circle");
        System.out.println("Enter your choice - ");
        int area = sc.nextInt();

        switch(area)
        {
            case 1: Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter length and breadth of rectangle");
                double l = sc2.nextDouble();
                double b = sc2.nextDouble();
                double area0 = l * b;
                System.out.println("Area of Rectangle is :" + area0);
                break;


            case 2: Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter the area of Square");
                int a = sc3.nextInt();
                int area1 = a * a;
                System.out.println("Area of Square is :" + area1);
                break;


            case 3: Scanner sc4 = new Scanner(System.in);
                System.out.println("Enter height and base of Triangle");
                double h = sc4.nextDouble();
                double base = sc4.nextDouble();
                double area2 = h * base/2;
                System.out.println("Area of Triangle is :" + area2);
                break;



            case 4: Scanner sc5 = new Scanner(System.in);
                System.out.println("Enter radius of Circle");
                double r = sc5.nextDouble();
                double area3 = 3.14 * r * r;
                System.out.println("Area of Circle is :" + area3);
                break;

            default : System.out.println("Invalid input");
        }
    }
}
