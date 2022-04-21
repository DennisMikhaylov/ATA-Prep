public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int num) {
        for (int i = 0; i < num; i++){
            System.out.println(i + 1);
        }
    }
}