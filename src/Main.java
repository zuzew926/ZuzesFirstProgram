public class Main {
    public static void main(String[] args) {
        int APPLES_PURCHASED = 24;
        double APPLE_UNIT_PRICE = 0.60;

        int PINEAPPLE_PURCHASED = 2;
        double PINEAPPLE_COST = 3.59;

        int BAGS_OF_RICE = 3;
        int BAG_OF_RICE_KILO_WEIGHT = 2;
        double RICE_UNIT_PRICE_POUND = 1.39;
        double KILOGRAM_POUND_RATIO = 2.205;

        double RICE_COST = ((BAGS_OF_RICE * BAG_OF_RICE_KILO_WEIGHT) * KILOGRAM_POUND_RATIO) * RICE_UNIT_PRICE_POUND;
        double TOTAL_PRICE = (APPLES_PURCHASED * APPLE_UNIT_PRICE + PINEAPPLE_PURCHASED * PINEAPPLE_COST + RICE_COST);

        System.out.println("Customer Name: Stacey");
        System.out.println("Items purchased: $" + (APPLES_PURCHASED + PINEAPPLE_PURCHASED + BAGS_OF_RICE));
        System.out.println("Total price: $" + TOTAL_PRICE);
        System.out.println("Average cost per item: $" + ((RICE_COST + (PINEAPPLE_COST * PINEAPPLE_PURCHASED + APPLES_PURCHASED * APPLE_UNIT_PRICE)) / 3));
        System.out.println("Amount tendered: $" + 40);
        System.out.println("Change: $" + (40 - TOTAL_PRICE));
    }
}