
package set10_4;


public class Set10_4 {


    public static void main(String[] args) {
        int x=7;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print(j);
     
            for(int sp = 1; sp <= x; sp++)
                System.out.print(" ");
            
            x = x - 2;
            
            int k = (i == 5)? 4 : i;
            
            for(int j = k; j >= 1; j--)
                System.out.print(j);
            
            System.out.println();
        }
    }
    
}
