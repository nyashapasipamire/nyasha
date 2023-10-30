public class Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter the first number: ");
            float firstNumber = scanner.nextFloat();
            System.out.print("Enter the second number: ");
            float secondNumber = scanner.nextFloat();

            // Perform calculations
            float sum = firstNumber + secondNumber;
            float difference = firstNumber - secondNumber;
            float product = firstNumber * secondNumber;
            float quotient = firstNumber / secondNumber;

            // Display results
            System.out.printf("Sum: %.2f%n", sum);
            System.out.printf("Difference: %.2f%n", difference);
            System.out.printf("Product: %.2f%n", product);
            System.out.printf("Quotient: %.2f%n", quotient);

            scanner.close();
        }
    }


