public class TwoDimensionalArray {
    public static void main(String[] args) {

            int[][] matrix = new int[10][10];
            int sum = 0;

            // Fill the array with numbers from 0 to 9 on the diagonal and 0 outside the diagonal
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        matrix[i][j] = i;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Calculate the sum of the elements on the diagonal
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
            }

            // Display the matrix
            for (int[] row : matrix) {
                for (int number : row) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            // Display the sum of the elements on the diagonal
            System.out.println("Sum of elements on the diagonal: " + sum);
        }
    }
    


