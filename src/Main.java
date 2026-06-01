public class Main {

    public static int calculate(int orderPrice) {
        if (orderPrice >= 30000) {
            return 0;
        }

        return 3000;
    }
}
