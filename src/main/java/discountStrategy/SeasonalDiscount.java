package discountStrategy;

public class SeasonalDiscount implements DiscountStratergy{

    @Override
    public double applyDiscount(Order order) {
        // Assume the seasonal discount is 10% of the total amount
        return order.getTotalAmount() - (order.getTotalAmount() * 0.1);
    }
}
