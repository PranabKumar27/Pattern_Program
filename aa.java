package Star_Pattern;

public class aa
{

        public static void main(String[] args) {
            int row, col;
            int size = 7;

            for (row = 0; row < size; row++) {
                for (col = 0; col < size; col++) {
                    // Print '*' at the center, in the first row, and in the last column
                    if (row == size / 2 || col == size - 1 || (row == 0 && col <= size / 2)
                            || (col == 0 && row >= size / 2) || (row == size - 1 && col <= size / 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

