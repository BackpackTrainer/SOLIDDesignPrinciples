//TODO:  Refactor the order class so that we can have a variety of different discounts.
//We should not have to change the Order class every time we want to add a new discount.
//There will only be one discount at a time

package discountStrategy;

public class Order {
    private double totalAmount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double applyFlatDiscount() {
        // Assume the flat discount is 20% of the total amount
        return this.totalAmount - (this.totalAmount * 0.2);
    }

    public double applySeasonalDiscount() {
        // Assume the seasonal discount is 10% of the total amount
        return this.totalAmount - (this.totalAmount * 0.1);
    }

    // Other methods...
}
