import java.util.*;
 
public class Main{
    public static void main(String args[]) {
        int rows, i, j;
   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in pattern");
        rows = in.nextInt();
 
        for(i = 1; i <= rows; i++) {
            /* Prints one row of triangle */
            for(j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            /* move to next row */
            System.out.print("\n");
        }
    }
}