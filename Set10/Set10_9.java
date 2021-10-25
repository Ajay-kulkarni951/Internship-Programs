
package set10_9;

public class Set10_9 {


    public static void main(String[] args) {
        int k = 7;
        for(int i = 1; i <= 5; i++)
        {
            int x = 5;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(x--);
            }
            for(int sp = 1; sp <= k; sp++)
            {
                System.out.print(" ");
            }
            k = k - 2;
            int ele = (i == 5)? 4 : i;
            int p = 6 - ele;
            for(int j = 1; j <= ele; j++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }
    }
    
}
