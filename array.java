import java.util.Arrays;

public class array {
    public static void main(String[] args) {


        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int counter = 0;
        System.out.println("Before");
        System.out.println(Arrays.toString(array));

        for (int j = 0; j < array.length - 1; j++) {

            if (array[j] > array[j + 1]) {
                int greater = array[j + 1];
                array[j] = array[j + 1];
                array[j + 1] = greater;
            }
        }
    }
}
