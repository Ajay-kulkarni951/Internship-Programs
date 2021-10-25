/*WAP to illustrate the use of shortcut of assignment operator for all bitwise operations*/
package set4_8;


public class Set4_8 {

    
    public static void main(String[] args) {
        int a = 5;
        a &= 4;
        System.out.println(a);
        a |= 3;
        System.out.println(a);
        a >>= 1;
        System.out.println(a);
        a <<= 2;
        System.out.println(a);
    }
    
}
