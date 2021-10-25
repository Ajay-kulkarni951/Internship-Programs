
package set10_5;


public class Set10_5 {

 
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--)
        {
            for(int sp = 1; sp <=(5-i);sp++)
            {
                System.out.print(" ");
            }
            
            for(int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            
            for(int j = 2; j <= i; j++)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
    
}
