public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int amount = 1000000;
        double percent = 9.99;
        int duration1 = 12;
        int duration2 = 24;
        int duration3 = 36;

        int payment1 = creditPaymentService.calculatePayment(amount, percent, duration1);
        int payment2 = creditPaymentService.calculatePayment(amount, percent, duration2);
        int payment3 = creditPaymentService.calculatePayment(amount, percent, duration3);

        System.out.println("Ежемесячный платеж (" + duration1 + " мес) " + payment1);
        System.out.println("Ежемесячный платеж (" + duration2 + " мес) " + payment2);
        System.out.println("Ежемесячный платеж (" + duration3 + " мес) " + payment3);
    }
}