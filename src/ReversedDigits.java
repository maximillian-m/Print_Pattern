public class ReversedDigits {

    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number){
        if(number < 0){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit;
        int num = number;
        while (num > 0){
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}
