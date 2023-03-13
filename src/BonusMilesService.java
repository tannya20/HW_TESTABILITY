public class BonusMilesService {
    public static int calculate(int price) {
        int rubles = 20; // 1 миля за рублей

        int miles = 1;

        int result = price / 20 * miles;
        return result;
    }
}