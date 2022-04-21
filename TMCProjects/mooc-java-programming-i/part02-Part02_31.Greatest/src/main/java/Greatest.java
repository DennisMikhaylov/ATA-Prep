public class Greatest {
    public static int greatest(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
            return c;
        } else if (b > a) {
            if (b > c) {
                return b;
            }
            return c;
        }
        return c;
    }
}