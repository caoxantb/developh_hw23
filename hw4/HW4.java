package hw4;

public final class HW4 {
    private HW4() {
        //
    }

    public static Integer divisibility(int a, int b) {
        if (b == 0) return null;
        return (a % b != 0) ? b - a % b : 0;
    }
}
