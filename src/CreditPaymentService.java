public class CreditPaymentService {
    public int calculatePayment(int amountRub, double percentYear, int period) {
        double percentMonth = percentYear / period / 100;
        double coefficient = percentMonth * Math.pow(1 + percentMonth, period) / (Math.pow(1 + percentMonth, period) - 1);
        double payment = amountRub * coefficient;
        return (int) payment;
    }
}

