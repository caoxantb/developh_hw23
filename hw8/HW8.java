package hw8;

public final class HW8 {
    private HW8() {
        //
    }

    public static boolean isMultipleBasePalindrome(int num) {
        int biNum = intToBi(num);
        return isPalindrome(num) && isPalindrome(biNum);
    }

    public static boolean isPalindrome(int num) {
        int tempNum = num;
        int reversedNum = 0;
        
        while (tempNum != 0) {
            int lastDigit = tempNum % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            tempNum /= 10;
        }

        return reversedNum == num;
    }

    public static Integer intToBi(int num) {
        int count = 0;
        int biNum = 0;

        while (num != 0) {
            int re = num % 2; 
            if (re == 1) biNum += Math.pow(10, count);
            count += 1;
            num /= 2;
        }

        return biNum;
    }
}
