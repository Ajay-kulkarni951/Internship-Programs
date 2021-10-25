
package set10_3;


public class Set10_3 {


    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
        {
            for(int sp = 1; sp <= (5-i); sp++)
                System.out.print(" ");
            int x = i;
            for(int j = 1; j <= i; j++)
                System.out.print(x++);
            x = x - 2;
            for(int j = 1; j < i; j++)
                System.out.print(x--);
            System.out.println(); 
        }
    }
    
}
