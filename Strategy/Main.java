import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Enter type: ");
        Scanner scanner = new Scanner(System.in);
        String paymentType = scanner.next();
        System.out.println("Enter Amount: ");
        Scanner amount = new Scanner(System.in);
        String amountPay = amount.next();
        System.out.println("Payment Type: "+paymentType);
        
        StrategyContext strategy = new StrategyContext();
        if (paymentType.equals("Cash")){
            strategy.setPaymentStrategy(new Cash());
        }
        else if (paymentType.equals("Online")){
            strategy.setPaymentStrategy(new Online());
        }
        else if (paymentType.equals("Card")){
            strategy.setPaymentStrategy(new Card());
        }

        strategy.payThePayment(amountPay);
    }
}
