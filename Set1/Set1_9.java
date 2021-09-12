/*9. Write a program which takes number of millimeter and converts them into meters, feets,
inches, centimeter and then millimeter.*/

package set1_9;

public class Set1_9
{
    public static void main(String[] args)
    {
       int myMillimeters = 1513;       
       int meters = myMillimeters / 1000;
       int remainder_1 = myMillimeters % 1000;
       int feats = remainder_1 / 300;
       int remainder_2 = remainder_1 % 300;
       int inches = remainder_2 / 25;       
       int remainder_3 = remainder_2 % 25;
       int centimeters = remainder_3 / 10;       
       int millimeters = remainder_3 % 10;
       
        System.out.println("Meters = "+ meters);
        System.out.println("Feats = "+ feats);
        System.out.println("Inches = "+ inches);
        System.out.println("Centimeters = "+ centimeters);
        System.out.println("Millimeters = "+ millimeters);
    }
}
