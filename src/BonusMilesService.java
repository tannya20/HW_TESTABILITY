public class BonusMilesService {
    public static int calculate(int price) {
        int rubles = 20; // 1 миля за рублей

        int miles;

        if (1 > 0) {
            miles = 1;
        } else {
            miles = 0;
        }
        int result = price / 20 * miles;
        return result;
    }
}