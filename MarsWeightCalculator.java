public class MarsWeightCalculator {
    public static void main(String[] args) {
        // Declare variables
        String name = "Nyasha";
        float earthWeightBielecki = 70.5f;
        float marsGravity = 0.38f;

        // Calculate weight on Mars
        float marsWeightBielecki = earthWeightBielecki * marsGravity;
        System.out.printf("Weight on Mars: %.4f%n", marsWeightBielecki);

        // Assign to double variable
        double marsWeightDouble = marsWeightBielecki;

        // Display double value
        System.out.printf("Mars weight (double): %.4f%n", marsWeightDouble);

        // Cast to int variable
        int marsWeightInt = (int) marsWeightDouble;

        // Display int value
        System.out.println("Mars weight (int): " + marsWeightInt);

        // Cast to char variable
        char marsWeightChar = (char) marsWeightInt;

        // Perform math operation on char variable
        int mathResult = marsWeightChar + 10;

        // Display final result
        System.out.println("Math operation result: " + mathResult);
    }
}

