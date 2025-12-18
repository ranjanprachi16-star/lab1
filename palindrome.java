public class palindrome{
        public static void main(String[] args) {
            int num = 143341;
            int original = num;
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            if (original == reverse) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is not a Palindrome.");
            }
        }
    }

