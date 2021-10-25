
package set10_10;


public class Set10_10 {


    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--)
        {
            for(int sp = 1; sp <= (i - 1); sp++)
            {
                System.out.print(" ");
            }
            
            for(int j = i; j <= 5; j++)
            {
                System.out.print(j);
            }
            
            int x = 4;
            
            for(int j = i; j < 5; j++)
            {
                System.out.print(x--);
            }
            
            System.out.println();
        }
    }
    
}
