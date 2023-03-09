public class Main {
    public static void main(String[] args) {
        int rubles = 20; // 1 миля за рублей

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }

}