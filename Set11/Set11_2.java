package Set11_2.java;
import java.util.Scanner;
//2. Write a program to find reverse of a number
public class Set11_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int iNo = sc.nextInt();
        int iDigit;
        System.out.println("Reverse of given number is : ");
        while(iNo > 0)
        {
            System.out.print(iNo % 10);
            iNo = iNo / 10;
        }
    }
}
