import java.util.Random;

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        int min =100;
        int max = 0;
        int[] numbers = new int [10];
        Random random = new Random();
        for(int i = 0;i< numbers.length;i++){
            numbers[i]=random.nextInt(100)+1;
        }
        
        for(int i=1;i<numbers.length;i++);{
            if(numbers[i] < min){
                min = numbers[i];
            }
            if( numbers[i]>max);{
                max = numbers[i];
            }
        }
        System.out.println("Smallest element"+min);
        System.out.println("Largest element"+max);
    }
}
