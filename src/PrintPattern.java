public class PrintPattern {

        public static void main(String[] args)
        {
//            int size = 3;
//            System.out.println();
//            int i, j, k;
//            for (i = 1; i <=size; i++) { for (j = size; j > i; j--) {
//                System.out.print(" ");
//            }
//                for (k = 0; k < (2 * i - 1); k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
            int size = 9;// sets the size of the triangle to how many stars to print diagonally.
            for(int i = 1; i <= size; i++){          //iterating to print the rows.
                for(int j = 1; j <= (size * 2) - 1; j++) { // iterating to print the columns
                    if ((i + j == size + 1) || (j - i == size - 1)) { // conditions to check to print the stars
                        System.out.print("*");
                    } else if( i == size){ // second * printing condition
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
    }
        }
}
