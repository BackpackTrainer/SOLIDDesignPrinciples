package discountStrategy;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(100);
        order.setDiscountStratergy(new FlatDiscount());
        System.out.println(order.applyDiscount());

        order.setDiscountStratergy(new SeasonalDiscount());
        System.out.println(order.applyDiscount());
    }
}
