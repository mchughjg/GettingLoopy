public class GettingLoopy {

    public static void main(String[] args) {

       //Part A

	   for(int num = 0; num <= 20; num += 1)
           System.out.println(num + " ");
           System.out.println();
       for(int num = 20; num >= 0; num -= 1)
           System.out.println(num + " ");
           System.out.println();
       for(int num = 0; num <= 24; num += 3)
           System.out.println(num + " ");
           System.out.println();
       for(int num = 12; num >= 0; num -= 2)
           System.out.println(num + " ");
           System.out.println();

       //Part B

       for(int row = 1; row <= 5; row++) {
           for(int col = 1; col <= row; col++)
               System.out.print("*");
               System.out.println();
       }
       for(int row = 6; row >= 1; row--) {
           for(int col = 1; col <= row; col++)
               System.out.print("*");
               System.out.println();
       }
       for(int row = 1; row <= 5; row++) {
           for(int col = 1; col <= 5; col++)
               System.out.print("*");
               System.out.println();
       }
    }
}
