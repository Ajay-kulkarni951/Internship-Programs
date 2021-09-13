/*1. Write a program to find the mean and Standard Deviation of 5 integers */

package set2_1;

public class Set2_1
{

    public static void main(String[] args)
    {
       int first = 61, second = 63, third = 59, fourth = 57, fifth = 60, count = 5;
       
       double mean = (first + second + third + fourth + fifth) / count;
       
       double diff = (double) (Math.pow(mean - first, 2) + Math.pow(mean - second, 2) + Math.pow(mean - third, 2) + Math.pow(mean - fourth, 2) + Math.pow(mean - fifth, 2));
       
       double sd = (double) Math.sqrt( diff / count);
       
       double r1 = (double) mean - sd;       
       double r2 = (double) mean + sd;
       
        System.out.println("Mean is = "+mean);
        System.out.println("Standard Deviation is = "+r1+" to "+r2);
    }

}
