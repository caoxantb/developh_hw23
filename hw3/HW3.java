package hw3;

public final class HW3 {
    private HW3() {
        //
    }

    public static int countDigits(int num) {
        int count = 0;

        do {
            count++;
            num /= 10;
        } while(num != 0);
    
        return count;
    }
}
