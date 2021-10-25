
package set10_6;


public class Set10_6 {


    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
        {
            for(int sp = 1; sp <= (i-1); sp++)
            {
                System.out.print(" ");
            }
            
            for(int  j = i; j <= 5; j++)
            {
                System.out.print(j);
            }
            
            for(int j = 4; j >= i ; j--)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
    
}
