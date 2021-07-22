package hw11;

@SuppressWarnings("all")
public final class HW11 {
    private HW11() {
        //
    }

    public static int calculatePi(int n) {
        int pointInsideCirc = 0;
        int pointInsideSqr = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distToO = Math.pow(x, 2) + Math.pow(y, 2);
            if (distToO <= 1)
                pointInsideCirc++;
            pointInsideSqr++;

        }

        return 4*pointInsideCirc/pointInsideSqr;
    }
}
