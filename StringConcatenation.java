public class StringConcatenation {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take input from the user for two strings
            System.out.print("Enter the first string: ");
            String firstString = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String secondString = scanner.nextLine();


            String concatenatedString = firstString.concat(secondString);


            boolean isAlternating = checkAlternating(concatenatedString);


            if (isAlternating) {
                System.out.println("The concatenated string is alternating.");
            } else {
                System.out.println("The concatenated string is not alternating.");
            }
        }

        // Method to check if a string is alternating
        public static boolean checkAlternating(String str) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == str.charAt(i + 2)) {
                    return false;
                }
            }
            return true;
        }

    }
