
package set10_8;


public class Set10_8 {

  
    public static void main(String[] args) {
        int x = -1;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 5; j >= i; j--)
            {
                System.out.print(j);
            }
            for(int sp = 1; sp <= x; sp++)
            {
                System.out.print(" ");
            }
            
            x = x + 2;
            
            int k = (i == 1)? 2 : i;
            for(int j = k; j <= 5; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
