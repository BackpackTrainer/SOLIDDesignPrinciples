package discountStrategy;

public class Order{
    private double totalAmount;

    public void setDiscountStratergy(DiscountStratergy discountStratergy) {
        this.discountStratergy = discountStratergy;
    }

    private DiscountStratergy discountStratergy;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double applyDiscount() {
        return this.discountStratergy.applyDiscount(this);
    }

//    public double newSeasonalDiscount() {
//        return totalAmount;
//    }

    // Other methods...

}
