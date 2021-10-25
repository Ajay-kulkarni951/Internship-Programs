package Set11_3.java;
import java.util.Scanner;
//3. Write a program to find the binary equivalent of a given number
public class Set11_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int iNo = sc.nextInt();
        int iDigit;
        System.out.println("Binary equivalent of a given number is - ");
        while(iNo > 0)
        {
            iDigit = iNo % 2;
            System.out.print(iDigit);
            iNo = iNo / 2;
        }
    }
}
