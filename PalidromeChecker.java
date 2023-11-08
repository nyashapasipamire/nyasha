public class PalidromeChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

           
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();


            String lowercaseWord = word.toLowerCase();


            boolean isPalindrome = checkPalindrome(lowercaseWord);


            if (isPalindrome) {
                System.out.println("The word is a palindrome.");
            } else {
                System.out.println("The word is not a palindrome.");
            }
        }


        public static boolean checkPalindrome(String word) {
            int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }



