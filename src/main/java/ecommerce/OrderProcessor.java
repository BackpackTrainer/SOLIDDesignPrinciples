//TODO:  Refactor the OrderProcessor class so that it can work with a variety of
// different types of payment processors, not just credit cards. For example, it
// should be able to process payments via PayPal, Stripe, etc.
//
// TODO: refactor the OrderProcessor so that it can work with a variety of different notifiers,
// not just email. For example, it should be able to send notifications via SMS, Slack, etc.

package ecommerce;

import discountStrategy.Order;

public class OrderProcessor {
    private CreditPaymentProcessor paymentProcessor;
    private UserOrderNotifier notifier;

    public OrderProcessor() {
        this.paymentProcessor = new CreditPaymentProcessor();
        this.notifier = new UserOrderNotifier();
    }

    public void processOrder(Order order) {
        paymentProcessor.processPayment(order.getTotalAmount());
        notifier.notifyUserOrderConfirmed();
    }
}
