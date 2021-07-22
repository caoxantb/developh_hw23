package hw10;

public final class HW10 {
    private HW10() {
        //
    }

    public static int sumExponential(int n) {
        for (int base = 3; base < Math.ceil(Math.sqrt(n)); base++) {
            int nTemp = n;
            if (nTemp % base == 0) {
                while (nTemp > 0) {
                    int exp = (int)(Math.log(nTemp) / Math.log(base));
                    nTemp -= Math.pow(base, exp);
                    if (nTemp > Math.pow(base, exp)) break;
                }
                if (nTemp == 0) return base;
            }
        }
        return -1;
    }
}
