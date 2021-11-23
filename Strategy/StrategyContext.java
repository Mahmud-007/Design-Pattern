public class StrategyContext {
    private Payment payment;

    public Payment getPaymentStrategy() {
        return payment;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void payThePayment(String amount){
        payment.pay(amount);
    }
}
