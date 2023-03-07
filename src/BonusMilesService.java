public class BonusMilesService {
    public static int calculate(int price) {

        int rubles = 20; // 1 бонус за рублей
        boolean isRegistered = true;

        int miles;
        if (isRegistered) {
            miles = 1;
        } else {
            miles = 0;
        }

        // int  miles= isRegistered ? 1 : 0;

        int result = price / 20 * miles;

        if (miles > 500) {
            miles = 500;
        }
//        System.out.println("Стоимость билета: " + price + "\nВаш бонус составляет: " + result);
        return result;
    }
}



