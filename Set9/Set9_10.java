
package set9_10;


public class Set9_10 {


    public static void main(String[] args) {
        int x = 1;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(" "+x++);
            }
            System.out.println();
        }
    }
    
}
